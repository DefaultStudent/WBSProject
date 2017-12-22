package com.wbs.shopping.dao;

import com.wbs.bookinfo.vo.BookInfo;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author duke
 * @version 2017-12-21
 */
public class ShoppingDao extends HibernateDaoSupport {

    /**
     * 根据isbn查询图书信息
     * @param isbn
     * @return
     */
    public BookInfo findById(String isbn) {
        List<BookInfo> list = (List<BookInfo>) this.getHibernateTemplate().
                find("from BookInfo where isbn = ?", isbn);
        System.out.print(list.size());
        return list.get(0);
    }
}
