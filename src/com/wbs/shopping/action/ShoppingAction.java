package com.wbs.shopping.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wbs.bookinfo.vo.BookInfo;
import com.wbs.shopping.service.ShoppingService;
import com.wbs.shopping.vo.Shopping;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author duke
 * @version 2017-12-21
 */
public class ShoppingAction extends ActionSupport implements ModelDriven<Shopping>,SessionAware {

    Shopping shopping = new Shopping();
    private ShoppingService shoppingService;
    private Map<String,Object> session;

    @Override
    public Shopping getModel(){
        return shopping;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public ShoppingService getShoppingService() {
        return shoppingService;
    }

    public void setShoppingService(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    public String addCar(){
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        String isbn = request.getParameter("isbn");
        BookInfo bookInfo = shoppingService.findByISBN(isbn);
        List<BookInfo> list = null;
        if (session.getAttribute("shop") == null) {
            list = new ArrayList<BookInfo>();
        } else {
            list = (List<BookInfo>)session.getAttribute("shop");
        }
        list.add(bookInfo);
        session.setAttribute("shop", list);
        return SUCCESS;
    }

}
