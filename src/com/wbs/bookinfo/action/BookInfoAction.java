package com.wbs.bookinfo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wbs.bookinfo.service.BookInfoService;
import com.wbs.bookinfo.vo.BookInfo;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.HttpParametersAware;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.spi.http.HttpContext;
import java.util.List;
import java.util.Map;

/**
 * @author Simon
 * @version 1.0 2017-12-21
 */

public class BookInfoAction extends ActionSupport implements ModelDriven<BookInfo>,SessionAware{
    private BookInfo bookInfo = new BookInfo();
    private BookInfoService bookInfoService;
    private List<BookInfo> list;
    private Map<String,Object> session;

    public BookInfoService getBookInfoService() {
        return bookInfoService;
    }

    public void setBookInfoService(BookInfoService bookInfoService) {
        this.bookInfoService = bookInfoService;
    }

    public void setSession(Map<String, Object> session) {

        this.session = session;
    }

    public void setList(List<BookInfo> list) {
        this.list = list;
    }

    @Override
    public BookInfo getModel() {
        return bookInfo;
    }

    public String findAllBook() throws Exception{
         list = bookInfoService.findAllBookInfo();
         session.put("bookinfo",list);
        return SUCCESS;
    }

    public String findBookByName() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        String bookname = request.getParameter("bookname");
        BookInfo bookInfo1 = bookInfoService.findBookByName(bookname);
        session.setAttribute("bookname",bookInfo1.getBookname());
        session.setAttribute("isbn",bookInfo1.getIsbn());
        session.setAttribute("booktypename",bookInfo1.getBooktypename());
        session.setAttribute("bookprice",bookInfo1.getBookprice());
        session.setAttribute("pubname",bookInfo1.getPubname());
        return  SUCCESS;
    }
}
