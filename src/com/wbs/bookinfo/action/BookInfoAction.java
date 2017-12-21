package com.wbs.bookinfo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wbs.bookinfo.service.BookInfoService;
import com.wbs.bookinfo.vo.BookInfo;

/**
 * @author Simon
 * @version 1.0 2017-12-21
 */

public class BookInfoAction extends ActionSupport implements ModelDriven<BookInfo>{
    private BookInfo bookInfo = new BookInfo();
    private BookInfoService bookInfoService;

    public void setBookInfoService(BookInfoService bookInfoService) {
        this.bookInfoService = bookInfoService;
    }

    @Override
    public BookInfo getModel() {
        return bookInfo;
    }

    public String findAllBook() throws Exception{
        bookInfoService.findAllBookInfo();
        return SUCCESS;
    }
}
