package com.wbs.bookinfo.dao;

import com.wbs.bookinfo.vo.BookInfo;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import javax.management.Query;
import java.util.List;

/**
 * @author
 * @version 1.0 2017-12-21
 */

public class BookInfoDao extends HibernateDaoSupport{

    /**
     * 查询全部图书信息
     * @param bookInfo
     * @return
     */
    public List<BookInfo> findAllBookInfo(BookInfo bookInfo){
        String hql = "from BookInfo";
        List<BookInfo> list = (List<BookInfo>) this.getHibernateTemplate().find(hql);
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }
}
