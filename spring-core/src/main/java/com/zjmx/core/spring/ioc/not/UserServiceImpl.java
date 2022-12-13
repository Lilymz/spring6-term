package com.zjmx.core.spring.ioc.not;

import com.zjmx.core.spring.beans.Book;

import java.util.List;

public class UserServiceImpl {
    /**
     * 如果BookDaoImpl里面存在多个对象依赖
     */
    private BookDaoImpl bookDao;
    public List<Book> findAll() {
        bookDao = new BookDaoImpl();
        return bookDao.query();
    }
}
