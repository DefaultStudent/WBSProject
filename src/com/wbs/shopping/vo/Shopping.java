package com.wbs.shopping.vo;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author duke
 * @version 2017-12-21
 */
public class Shopping {
    private String sBookname;
    private double sBookprice;
    private int total;

    public String getsBookname() {
        return sBookname;
    }

    public void setsBookname(String sBookname) {
        this.sBookname = sBookname;
    }

    public double getsBookprice() {
        return sBookprice;
    }

    public void setsBookprice(double sBookprice) {
        this.sBookprice = sBookprice;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shopping shopping = (Shopping) o;
        return total == shopping.total &&
                Objects.equals(sBookname, shopping.sBookname) &&
                Objects.equals(sBookprice, shopping.sBookprice);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sBookname, sBookprice, total);
    }
}
