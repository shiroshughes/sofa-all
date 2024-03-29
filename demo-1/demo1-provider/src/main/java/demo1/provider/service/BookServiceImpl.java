package demo1.provider.service;

import com.demo1.api.BookService;
import org.springframework.stereotype.Service;

@Service(value = "book")
public class BookServiceImpl implements BookService {
    @Override
    public String get(Integer id) {
        return null;
    }
}
