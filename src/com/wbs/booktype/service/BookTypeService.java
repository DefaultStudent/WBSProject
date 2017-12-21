package com.wbs.booktype.service;

import com.wbs.booktype.dao.BookTypeDao;
import com.wbs.booktype.vo.BookType;

import java.util.List;

public class BookTypeService {
    private BookTypeDao bookTypeDao;

    public BookTypeDao getBookTypeDao() {
        return bookTypeDao;
    }

    public void setBookTypeDao(BookTypeDao bookTypeDao) {
        this.bookTypeDao = bookTypeDao;
    }

    /**
     * @return
     */
    public List<BookType> selectAll(){
        return bookTypeDao.selectAll();
    }
}
