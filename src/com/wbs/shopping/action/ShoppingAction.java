package com.wbs.shopping.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wbs.shopping.service.ShoppingService;
import com.wbs.shopping.vo.Shopping;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * @author duke
 * @version 2017-12-21
 */
public class ShoppingAction extends ActionSupport implements ModelDriven<Shopping>,SessionAware {

    Shopping shopping = new Shopping();
    private ShoppingService shoppingService;
    private Map<String,Object> session;

    /**
     * 模型驱动
     * @return customer
     */
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

}
