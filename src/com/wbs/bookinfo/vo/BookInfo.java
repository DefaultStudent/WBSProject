package com.wbs.bookinfo.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author Simon
 * @version 1.0 2017-12-21
 */

@Entity
public class BookInfo {
    private String bookname;
    private String booktypename;
    private String isbn;
    private double bookprice;
    private String pubname;
    private String pubdate;
    private String author;
    private String introduce;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBooktypename() {
        return booktypename;
    }

    public void setBooktypename(String booktypename) {
        this.booktypename = booktypename;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getBookprice() {
        return bookprice;
    }

    public void setBookprice(double bookprice) {
        this.bookprice = bookprice;
    }

    public String getPubname() {
        return pubname;
    }

    public void setPubname(String pubname) {
        this.pubname = pubname;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookInfo bookInfo = (BookInfo) o;
        return Objects.equals(bookname, bookInfo.bookname) &&
                Objects.equals(booktypename, bookInfo.booktypename) &&
                Objects.equals(isbn, bookInfo.isbn) &&
                Objects.equals(bookprice, bookInfo.bookprice) &&
                Objects.equals(pubname, bookInfo.pubname) &&
                Objects.equals(pubdate, bookInfo.pubdate) &&
                Objects.equals(author, bookInfo.author) &&
                Objects.equals(introduce, bookInfo.introduce);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bookname, booktypename, isbn, bookprice, pubname, pubdate, author, introduce);
    }
}
