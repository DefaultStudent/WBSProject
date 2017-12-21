package com.wbs.customer.vo;

import java.util.Objects;

/**
 * @author Simon
 * @version 1.0 2017-12-20
 */

public class Customers {
    private String cusId;
    private String cusAlias;
    private String cusPwd;
    private String cusName;
    private String cusTel;
    private String cusGender;
    private String cusBirth;
    private String cusAddress;
    private int ulimit;

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


    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }


    public int getUlimit() {
        return ulimit;
    }

    public void setUlimit(int ulimit) {
        this.ulimit = ulimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Customers customers = (Customers) o;
        return ulimit == customers.ulimit &&
                Objects.equals(cusId, customers.cusId) &&
                Objects.equals(cusAlias, customers.cusAlias) &&
                Objects.equals(cusPwd, customers.cusPwd) &&
                Objects.equals(cusName, customers.cusName) &&
                Objects.equals(cusTel, customers.cusTel) &&
                Objects.equals(cusGender, customers.cusGender) &&
                Objects.equals(cusBirth, customers.cusBirth) &&
                Objects.equals(cusAddress, customers.cusAddress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cusId, cusAlias, cusPwd, cusName, cusTel, cusGender, cusBirth, cusAddress, ulimit);
    }
}
