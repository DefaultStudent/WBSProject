package com.wbs.bookinfo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wbs.bookinfo.service.BookInfoService;
import com.wbs.bookinfo.vo.BookInfo;
import org.apache.struts2.ServletActionContext;
import org.springframework.mock.web.MockHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

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
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession httpSession = request.getSession();
        List<BookInfo> list = bookInfoService.findAllBookInfo();
        for (BookInfo bookInfo1 : list) {
            httpSession.setAttribute("bookinfo", bookInfo1);
            System.out.printf(bookInfo1.getAuthor());
        }
        return SUCCESS;
    }
}
