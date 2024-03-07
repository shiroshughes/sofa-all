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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProtoService.proto

package com.zr.sofa.rpc.protobuf;

/**
 * Protobuf type {@code com.zr.sofa.rpc.protobuf.EchoResponse}
 */
public final class EchoResponse extends
                               com.google.protobuf.GeneratedMessageV3 implements
                                                                     // @@protoc_insertion_point(message_implements:com.alipay.sofa.rpc.protobuf.EchoResponse)
                                                                     EchoResponseOrBuilder {
    // Use EchoResponse.newBuilder() to construct.
    private EchoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private EchoResponse() {
        code_ = 0;
        message_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private EchoResponse(
                         com.google.protobuf.CodedInputStream input,
                         com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                                                                     throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        int mutable_bitField0_ = 0;
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    default: {
                        if (!input.skipField(tag)) {
                            done = true;
                        }
                        break;
                    }
                    case 8: {

                        code_ = input.readInt32();
                        break;
                    }
                    case 18: {
                        String s = input.readStringRequireUtf8();

                        message_ = s;
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(
                e).setUnfinishedMessage(this);
        } finally {
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
        return ProtoServiceOuterClass.internal_static_com_alipay_sofa_rpc_protobuf_EchoResponse_descriptor;
    }

    protected FieldAccessorTable
            internalGetFieldAccessorTable() {
        return ProtoServiceOuterClass.internal_static_com_alipay_sofa_rpc_protobuf_EchoResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EchoResponse.class,
                Builder.class);
    }

    public static final int CODE_FIELD_NUMBER = 1;
    private int             code_;

    /**
     * <code>int32 code = 1;</code>
     */
    public int getCode() {
        return code_;
    }

    public static final int           MESSAGE_FIELD_NUMBER = 2;
    private volatile Object message_;

    /**
     * <code>string message = 2;</code>
     */
    public String getMessage() {
        Object ref = message_;
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            message_ = s;
            return s;
        }
    }

    /**
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
            getMessageBytes() {
        Object ref = message_;
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (String) ref);
            message_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1)
            return true;
        if (isInitialized == 0)
            return false;

        memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
        if (code_ != 0) {
            output.writeInt32(1, code_);
        }
        if (!getMessageBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1)
            return size;

        size = 0;
        if (code_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                .computeInt32Size(1, code_);
        }
        if (!getMessageBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
        }
        memoizedSize = size;
        return size;
    }

    private static final long serialVersionUID = 0L;

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EchoResponse)) {
            return super.equals(obj);
        }
        EchoResponse other = (  EchoResponse) obj;

        boolean result = true;
        result = result && (getCode()
                == other.getCode());
        result = result && getMessage()
            .equals(other.getMessage());
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + CODE_FIELD_NUMBER;
        hash = (53 * hash) + getCode();
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static EchoResponse parseFrom(
                                                                      com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static EchoResponse parseFrom(
                                                                      com.google.protobuf.ByteString data,
                                                                      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static EchoResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static EchoResponse parseFrom(
                                                                      byte[] data,
                                                                      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static EchoResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static EchoResponse parseFrom(
                                                                      java.io.InputStream input,
                                                                      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static EchoResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
    }

    public static EchoResponse parseDelimitedFrom(
                                                                               java.io.InputStream input,
                                                                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static EchoResponse parseFrom(
                                                                      com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static EchoResponse parseFrom(
                                                                      com.google.protobuf.CodedInputStream input,
                                                                      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(  EchoResponse prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
                                        BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * Protobuf type {@code com.zr.sofa.rpc.protobuf.EchoResponse}
     */
    public static final class Builder extends
                                     com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                                                                                            implements
                                                                                            // @@protoc_insertion_point(builder_implements:  EchoResponse)
                                                                                            EchoResponseOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
            return ProtoServiceOuterClass.internal_static_com_alipay_sofa_rpc_protobuf_EchoResponse_descriptor;
        }

        protected FieldAccessorTable
                internalGetFieldAccessorTable() {
            return ProtoServiceOuterClass.internal_static_com_alipay_sofa_rpc_protobuf_EchoResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    EchoResponse.class,
                    Builder.class);
        }

        // Construct using com.zr.sofa.rpc.protobuf.EchoResponse.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                        BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
            }
        }

        public Builder clear() {
            super.clear();
            code_ = 0;

            message_ = "";

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
            return ProtoServiceOuterClass.internal_static_com_alipay_sofa_rpc_protobuf_EchoResponse_descriptor;
        }

        public EchoResponse getDefaultInstanceForType() {
            return EchoResponse.getDefaultInstance();
        }

        public EchoResponse build() {
            EchoResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public EchoResponse buildPartial() {
            EchoResponse result = new EchoResponse(this);
            result.code_ = code_;
            result.message_ = message_;
            onBuilt();
            return result;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(
                                com.google.protobuf.Descriptors.FieldDescriptor field,
                                Object value) {
            return (Builder) super.setField(field, value);
        }

        public Builder clearField(
                                  com.google.protobuf.Descriptors.FieldDescriptor field) {
            return (Builder) super.clearField(field);
        }

        public Builder clearOneof(
                                  com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return (Builder) super.clearOneof(oneof);
        }

        public Builder setRepeatedField(
                                        com.google.protobuf.Descriptors.FieldDescriptor field,
                                        int index, Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }

        public Builder addRepeatedField(
                                        com.google.protobuf.Descriptors.FieldDescriptor field,
                                        Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof EchoResponse) {
                return mergeFrom((  EchoResponse) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom( EchoResponse other) {
            if (other == EchoResponse.getDefaultInstance())
                return this;
            if (other.getCode() != 0) {
                setCode(other.getCode());
            }
            if (!other.getMessage().isEmpty()) {
                message_ = other.message_;
                onChanged();
            }
            onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(
                                 com.google.protobuf.CodedInputStream input,
                                 com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
            EchoResponse parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = ( EchoResponse) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int code_;

        /**
         * <code>int32 code = 1;</code>
         */
        public int getCode() {
            return code_;
        }

        /**
         * <code>int32 code = 1;</code>
         */
        public Builder setCode(int value) {

            code_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>int32 code = 1;</code>
         */
        public Builder clearCode() {

            code_ = 0;
            onChanged();
            return this;
        }

        private Object message_ = "";

        /**
         * <code>string message = 2;</code>
         */
        public String getMessage() {
            Object ref = message_;
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                message_ = s;
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <code>string message = 2;</code>
         */
        public com.google.protobuf.ByteString
                getMessageBytes() {
            Object ref = message_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                            (String) ref);
                message_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string message = 2;</code>
         */
        public Builder setMessage(
                                  String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            message_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string message = 2;</code>
         */
        public Builder clearMessage() {

            message_ = getDefaultInstance().getMessage();
            onChanged();
            return this;
        }

        /**
         * <code>string message = 2;</code>
         */
        public Builder setMessageBytes(
                                       com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            message_ = value;
            onChanged();
            return this;
        }

        public final Builder setUnknownFields(
                                              final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }

        public final Builder mergeUnknownFields(
                                                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }

        // @@protoc_insertion_point(builder_scope: EchoResponse)
    }

    // @@protoc_insertion_point(class_scope: EchoResponse)
    private static final EchoResponse DEFAULT_INSTANCE;
    static {
        DEFAULT_INSTANCE = new EchoResponse();
    }

    public static EchoResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EchoResponse> PARSER = new com.google.protobuf.AbstractParser<EchoResponse>() {
                                                                             public EchoResponse parsePartialFrom(
                                                                                                                  com.google.protobuf.CodedInputStream input,
                                                                                                                  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                                                                 throws com.google.protobuf.InvalidProtocolBufferException {
                                                                                 return new EchoResponse(input,
                                                                                     extensionRegistry);
                                                                             }
                                                                         };

    public static com.google.protobuf.Parser<EchoResponse> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<EchoResponse> getParserForType() {
        return PARSER;
    }

    public EchoResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}
