package com.wbs.bookinfo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wbs.bookinfo.service.BookInfoService;
import com.wbs.bookinfo.vo.BookInfo;

import org.apache.struts2.interceptor.SessionAware;

import java.util.*;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.mock.web.MockHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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

    public void setSession(Map<String, Object> session) {

        this.session = session;
    }


    public List<BookInfo> getList() {
        return list;
    }

    public void setList(List<BookInfo> list) {
        this.list = list;
    }
public class BookInfoAction extends ActionSupport implements ModelDriven<BookInfo>, SessionAware{
    private BookInfo bookInfo = new BookInfo();
    private BookInfoService bookInfoService;
    private Map<String, Object> session;

    public Map<String, Object> getSession() {
        return session;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public void setBookInfoService(BookInfoService bookInfoService) {
        this.bookInfoService = bookInfoService;
    }

    @Override
    public BookInfo getModel() {
        return bookInfo;
    }

    public String findAllBook() throws Exception{
         list = bookInfoService.findAllBookInfo();
         session.put("bookinfo",list);
        List<BookInfo> list = bookInfoService.findAllBookInfo();
        session.put("bookinfo", list);
        return SUCCESS;
    }
}
