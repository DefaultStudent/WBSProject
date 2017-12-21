package com.wbs.customer.service;

import com.wbs.customer.dao.CustomerDao;
import com.wbs.customer.vo.Customers;

import java.util.List;

/**
 * @author Simon
 * @version 1.0 2017-12-20
 */

public class CustomerService {

    private CustomerDao customerDao;

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    /**
     * 登陆
     * @param customers
     * @return
     */
    public Customers login(Customers customers){
        return customerDao.login(customers);
    }

    /**
     * 注册
     * @param customers
     */
    public void register(Customers customers){
        customerDao.register(customers);
    }
}
