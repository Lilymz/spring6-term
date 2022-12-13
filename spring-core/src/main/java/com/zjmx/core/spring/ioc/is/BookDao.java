package com.zjmx.core.spring.ioc.is;

import com.zjmx.core.spring.beans.Book;

import java.util.List;

public interface BookDao {
    /**
     * 获取当前程序中所有图书
     */
    List<Book> query();
}
