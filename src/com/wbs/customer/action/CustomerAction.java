package com.wbs.customer.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wbs.customer.dao.CustomerDao;
import com.wbs.customer.vo.Customers;

import java.util.List;
import java.util.Map;

/**
 * @author Simon
 * @version 1.0 2017-12-20
 */

public class CustomerAction extends ActionSupport{

    private Customers customer;
    private CustomerDao customerDao;
    private Map<String, Object> session;

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public Customers getCustomers() {
        return customer;
    }

    public void setCustomers(Customers customer) {
        this.customer = customer;
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public String login() throws Exception {
        List<Customers> customer1 = customerDao.login(customer);
        if (customer1 == null) {
            return ERROR;
        }

        return SUCCESS;

    }
}
