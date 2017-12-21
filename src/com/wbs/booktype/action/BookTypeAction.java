package com.wbs.booktype.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wbs.booktype.service.BookTypeService;
import com.wbs.booktype.vo.BookType;
import org.apache.struts2.components.If;

public class BookTypeAction extends ActionSupport implements ModelDriven<BookType> {

    BookType bookType = new BookType();
    private BookTypeService bookTypeService;

    public BookTypeService getBookTypeService() {
        return bookTypeService;
    }

    public void setBookTypeService(BookTypeService bookTypeService) {
        this.bookTypeService = bookTypeService;
    }

    /**
     * 模型驱动
     * @return customer
     */
    @Override
    public BookType getModel(){
        return bookType;
    }


    public String queryAll() throws Exception {
        bookTypeService.selectAll();
        return SUCCESS;
    }
}
