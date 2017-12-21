package com.wbs.bookinfo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wbs.bookinfo.service.BookInfoService;
import com.wbs.bookinfo.vo.BookInfo;

import java.util.List;

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

        if (bookInfoService.findAllBookInfo(bookInfo) == null) {
            return ERROR;
        } else {
            return SUCCESS;
        }
    }
}
