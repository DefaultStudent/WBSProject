package com.wbs.booktype.dao;


import com.wbs.booktype.vo.BookType;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

public class BookTypeDao extends HibernateDaoSupport{
    /**
     * 查看图书类型
     * @param
     * @return
     */
    public List<BookType> selectAll() {
        String sql = "from BookType";
        List<BookType> list = (List<BookType>)this.getHibernateTemplate().find(sql);
        return list;
    }
}
