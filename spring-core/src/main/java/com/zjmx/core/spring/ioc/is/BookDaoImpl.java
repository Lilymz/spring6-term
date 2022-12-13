package com.zjmx.core.spring.ioc.is;


import com.zjmx.core.spring.beans.Book;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;


public class BookDaoImpl implements BookDao {
    @Override
    public List<Book> query() {
        Book book1 = new Book("高等数学","25633426614",new BigDecimal("30.3"));
        Book book2 = new Book("大学英语","25633426645",new BigDecimal("36.5"));
        return Arrays.asList(book1,book2);
    }
}
