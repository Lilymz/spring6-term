package com.zjmx.core.spring.ioc.is;

import com.zjmx.core.spring.beans.Book;

import java.util.List;

public interface UserService {
    List<Book> findAll();
}
