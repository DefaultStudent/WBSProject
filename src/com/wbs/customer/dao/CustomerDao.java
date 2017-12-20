package com.wbs.customer.dao;

import com.wbs.customer.vo.Customer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;

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

    public Customer login(Customer customer){
        String sql = "from Customer";
        Query query = getSession().createQuery(sql);
        List<Customer> list = query.list();
        for (Customer customer1 : list){
            if (customer1.getCusId().equals(customer.getCusId()) && customer1.getCusPwd().equals(customer.getCusPwd())){
                return customer1;
            }
        }
        return null;
    }
}
