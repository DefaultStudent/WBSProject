package com.wbs.bookinfo.dao;

import com.wbs.bookinfo.vo.BookInfo;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author Simon
 * @version 1.0 2017-12-21
 */

public class BookInfoDao extends HibernateDaoSupport{
    /**
     *
     * @return
     */
    public List<BookInfo> findAllBookInfo(){
        String hql = "from BookInfo";
        List<BookInfo> list = (List<BookInfo>) this.getHibernateTemplate().find(hql);
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }
}
