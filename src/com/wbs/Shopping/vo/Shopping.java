package com.wbs.Shopping.vo;

import java.math.BigDecimal;
import java.util.Objects;

public class Shopping {
    private String sBookname;
    private BigDecimal sBookprice;
    private int total;

    public String getsBookname() {
        return sBookname;
    }

    public void setsBookname(String sBookname) {
        this.sBookname = sBookname;
    }

    public BigDecimal getsBookprice() {
        return sBookprice;
    }

    public void setsBookprice(BigDecimal sBookprice) {
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
