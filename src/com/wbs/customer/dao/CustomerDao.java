package com.wbs.customer.dao;

import com.wbs.customer.vo.Customers;
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

    public Customers login(Customers customer){

        String sql = "from Customers where cusId = ? and cusPwd = ?";
        List<Customers> list = (List<Customers>) this.getHibernateTemplate().find(sql, customer.getCusId(), customer.getCusPwd());
        System.out.print(list.size());
        if (list != null && list.size() > 0) {
            return list.get(0);
        } else {
            return nul;
        }

    }
}
