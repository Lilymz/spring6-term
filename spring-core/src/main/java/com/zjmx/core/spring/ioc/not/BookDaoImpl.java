package com.zjmx.core.spring.ioc.not;

import com.zjmx.core.spring.beans.Book;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class BookDaoImpl {
    public List<Book> query() {
        Book book1 = new Book("高等数学","25633426614",new BigDecimal("30.3"));
        Book book2 = new Book("大学英语","25633426614",new BigDecimal("30.3"));
        return Arrays.asList(book1,book2);
    }
}
