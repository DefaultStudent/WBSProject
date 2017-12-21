package com.wbs.bookinfo.service;

import com.wbs.bookinfo.dao.BookInfoDao;
import com.wbs.bookinfo.vo.BookInfo;

import java.util.List;

/**
 * @author Simon
 * @version 1.0 2017-12-21
 */

public class BookInfoService {
    private BookInfoDao bookInfoDao;

    public BookInfoDao getBookInfoDao() {
        return bookInfoDao;
    }

    public void setBookInfoDao(BookInfoDao bookInfoDao) {
        this.bookInfoDao = bookInfoDao;
    }

    /**
     *
     * @return
     */
    public List<BookInfo> findAllBookInfo(){
        return bookInfoDao.findAllBookInfo();
    }

}
