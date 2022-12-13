package com.zjmx.core.spring.ioc.is;

import com.zjmx.core.spring.beans.Book;

import java.util.List;

public class UserServiceImpl implements UserService{
    private BookDao bookDao;
    @Override
    public List<Book> findAll() {
        bookDao = new BookDaoImpl();
        return bookDao.query();
    }
}
