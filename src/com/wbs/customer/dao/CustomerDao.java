package com.wbs.customer.dao;

import com.wbs.customer.vo.Customers;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Simon
 * @version 1.0 2017-12-20
 */

public class CustomerDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public List<Customers> login(Customers customer){

        String sql = "from Customers";
        Query query = getSession().createQuery(sql);
        List<Customers> list = query.list();
        System.out.printf("Customers list size"+list.size());
        for (Customers cus : list){
            System.out.println(cus.getCusId());
        }
        return list;
    }
}
