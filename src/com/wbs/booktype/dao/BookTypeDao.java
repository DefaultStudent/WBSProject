package com.wbs.booktype.dao;


import com.wbs.booktype.vo.BookType;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author duke
 * @version 2017-12-21
 */
public class BookTypeDao extends HibernateDaoSupport{
    /**
     * 查询全部图书类型
     * @return list
     */
    public List<BookType> selectAll() {
        String sql = "from BookType";
        List<BookType> list = (List<BookType>)this.getHibernateTemplate().find(sql);
        return list;
    }

    /**
     *
     */
}
