package com.wbs.shopping.service;

import com.wbs.shopping.dao.ShoppingDao;

/**
 * @author duke
 * @version 2017-12-21
 */
public class ShoppingService {

    private ShoppingDao shoppingDao;

    public ShoppingDao getShoppingDao() {
        return shoppingDao;
    }

    public void setShoppingDao(ShoppingDao shoppingDao) {
        this.shoppingDao = shoppingDao;
    }
}
