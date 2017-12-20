package com.wbs.customer.vo;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Simon
 * @version 1.0 2017-12-20
 */

@Entity
@Table(name = "Customers")
public class Customer {
    private int cusId;
    private String cusAlias;
    private String cusPwd;
}
