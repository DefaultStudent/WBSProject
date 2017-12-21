package com.wbs.booktype.vo;

import java.util.Objects;

public class BookType {
    private int booktypeid;
    private String booktypename;

    public int getBooktypeid() {
        return booktypeid;
    }

    public void setBooktypeid(int booktypeid) {
        this.booktypeid = booktypeid;
    }

    public String getBooktypename() {
        return booktypename;
    }

    public void setBooktypename(String booktypename) {
        this.booktypename = booktypename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookType bookType = (BookType) o;
        return booktypeid == bookType.booktypeid &&
                Objects.equals(booktypename, bookType.booktypename);
    }

    @Override
    public int hashCode() {

        return Objects.hash(booktypeid, booktypename);
    }
}
