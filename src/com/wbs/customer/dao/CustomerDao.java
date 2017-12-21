package com.wbs.customer.dao;

import com.wbs.customer.action.CustomerAction;
import com.wbs.customer.vo.Customers;
import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Simon
 * @version 1.0 2017-12-20
 */

public class CustomerDao extends HibernateDaoSupport{

    /**
     * 用户登陆功能
     * @param customers
     * @return list
     */
    public Customers login(Customers customers){

        String sql = "from Customers where cusId = ? and cusPwd = ?";
        List<Customers> list = (List<Customers>) this.getHibernateTemplate().find(sql, customers.getCusId(), customers.getCusPwd());
        if (list != null && list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }

    }

    /**
     * 用户注册功能
     * @param customers
     * @return true
     */
    @Transactional(value = "transactionManager", rollbackFor = Exception.class)
    public void register(Customers customers){
        System.out.printf(customers.getCusId());
        this.getHibernateTemplate().save(customers);
    }
}
