/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zr.sofa.rpc.protobuf;

import com.alipay.sofa.rpc.common.struct.NamedThreadFactory;
import com.alipay.sofa.rpc.config.ApplicationConfig;
import com.alipay.sofa.rpc.config.ConsumerConfig;
import com.alipay.sofa.rpc.context.RpcRuntimeContext;
import com.alipay.sofa.rpc.log.Logger;
import com.alipay.sofa.rpc.log.LoggerFactory;
import com.zr.sofa.rpc.bolt.start.BoltClientMultipleMain;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 *
 *
 * @author <a href=ailto:zhanggeng.zg@antfin.com>GengZhang</a>
 */
public class ProtobufServiceClientMultipleMain {

    /**
     * slf4j Logger for this class
     */
    private final static Logger LOGGER = LoggerFactory.getLogger(BoltClientMultipleMain.class);

    public static void main(String[] args) {

        ApplicationConfig application = new ApplicationConfig().setAppName("test-client");
        ConsumerConfig<ProtoService> consumerConfig = new ConsumerConfig<ProtoService>()
            .setInterfaceId(ProtoService.class.getName()) // 指定接口
            .setProtocol("bolt") // 指定协议
            .setApplication(application)
            .setDirectUrl("bolt://127.0.0.1:12200") // 指定直连地址
            .setSerialization("protobuf") // 指定序列化协议，默认为hessian
            .setConnectTimeout(10 * 1000);

        final ProtoService helloService = consumerConfig.refer();

        LOGGER.warn("started at pid {}", RpcRuntimeContext.PID);

        final int threads = 50;
        final AtomicLong cnt = new AtomicLong(0);
        final ThreadPoolExecutor service1 = new ThreadPoolExecutor(threads, threads, 0L, TimeUnit.MILLISECONDS,
            new SynchronousQueue<Runnable>(), new NamedThreadFactory("client-"));// 无队列
        for (int i = 0; i < threads; i++) {
            service1.execute(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            EchoRequest request = EchoRequest.newBuilder().setGroup(Group.A).setName("12345678")
                                .build();
                            EchoResponse s = helloService.echoObj(request);
                            cnt.incrementAndGet();
                        } catch (Throwable e) {
                            LOGGER.error("", e);
                        }
                    }
                }
            });
        }

        Thread thread = new Thread(new Runnable() {
            private long last = 0;

            @Override
            public void run() {
                while (true) {
                    long count = cnt.get();
                    long tps = count - last;
                    LOGGER.error("last 1s invoke: {}, queue: {}", tps, service1.getQueue().size());
                    last = count;

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }, "Print-tps-THREAD");
        thread.start();
    }

}
