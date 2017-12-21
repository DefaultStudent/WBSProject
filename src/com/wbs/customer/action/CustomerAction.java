package com.wbs.customer.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wbs.customer.dao.CustomerDao;
import com.wbs.customer.vo.Customers;

import java.util.List;
import java.util.Map;

/**
 * @author Simon
 * @version 1.0 2017-12-20
 */

public class CustomerAction extends ActionSupport implements ModelDriven<Customers>{

    Customers customer = new Customers();
    private CustomerDao customerDao;

    /**
     * 模型驱动
     * @return customer
     */
    @Override
    public Customers getModel(){
        return customer;
    }


    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public String login() throws Exception {
        Customers cus = customerDao.login(getModel());
        if (cus == null){
            return INPUT;
        } else {
            return SUCCESS;
        }
    }
}
