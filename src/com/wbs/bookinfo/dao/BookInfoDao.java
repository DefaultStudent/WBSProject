package com.wbs.bookinfo.dao;

import com.wbs.bookinfo.vo.BookInfo;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @author duke
 * @version 1.0 2017-12-21
 */

public class BookInfoDao extends HibernateDaoSupport{
    /**
     *
     * @return list
     */
    public List<BookInfo> findAllBookInfo(){
        String hql = "from BookInfo";
        List<BookInfo> list = (List<BookInfo>) this.getHibernateTemplate().find(hql);
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }

    /**
     *
     * @param bookName
     * @return bookInfo
     */
    public BookInfo findBookByName(String bookName){
        String sql = "from BookInfo where bookname = ?";
        List<BookInfo> bookInfo = (List<BookInfo>) this.getHibernateTemplate().find(sql, bookName);
        return bookInfo.get(0);
    }
}
