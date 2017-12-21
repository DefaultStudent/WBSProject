package com.wbs.customer.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wbs.customer.dao.CustomerDao;
import com.wbs.customer.service.CustomerService;
import com.wbs.customer.vo.Customers;

import java.util.List;
import java.util.Map;

/**
 * @author Simon
 * @version 1.0 2017-12-20
 */

public class CustomerAction extends ActionSupport implements ModelDriven<Customers>{

    Customers customer = new Customers();
    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * 模型驱动
     * @return customer
     */
    @Override
    public Customers getModel(){
        return customer;
    }

    /**
     * 登陆功能
     * @return
     * @throws Exception
     */
    public String login() throws Exception {
        Customers cus = customerService.login(customer);
        if (cus == null){
            return INPUT;
        } else {
            return SUCCESS;
        }
    }

    public String register() throws Exception {
        customerService.register(customer);
        return SUCCESS;
    }
}
