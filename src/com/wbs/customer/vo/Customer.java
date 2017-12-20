package com.wbs.customer.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Simon
 * @version 1.0 2017-12-20
 */

@Entity
@Table(name="Customers")
public class Customer {
    private String cusId;
    private String cusAlias;
    private String cusPwd;
    private String cusName;
    private String cusTel;
    private String cusGender;
    private String cusBirth;

    @Id
    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getCusAlias() {
        return cusAlias;
    }

    public void setCusAlias(String cusAlias) {
        this.cusAlias = cusAlias;
    }

    public String getCusPwd() {
        return cusPwd;
    }

    public void setCusPwd(String cusPwd) {
        this.cusPwd = cusPwd;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusTel() {
        return cusTel;
    }

    public void setCusTel(String cusTel) {
        this.cusTel = cusTel;
    }

    public String getCusGender() {
        return cusGender;
    }

    public void setCusGender(String cusGender) {
        this.cusGender = cusGender;
    }

    public String getCusBirth() {
        return cusBirth;
    }

    public void setCusBirth(String cusBirth) {
        this.cusBirth = cusBirth;
    }
}
