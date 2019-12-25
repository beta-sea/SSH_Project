package com.fiend.dao.impl;

import com.fiend.dao.INewsFontDao;
import com.fiend.entity.Company;
import com.fiend.entity.News;
import com.fiend.util.BaseDao;

import java.util.List;

public class NewsFontDaoImpl extends BaseDao implements INewsFontDao {
    @Override
    public Company queryCom(int comId) {
        return (Company) super.commonGetObj(new Company(),comId);
    }

    @Override
    public List<News> queryNewsList(String sql) {
        return super.getSessionFactory().getCurrentSession()
                .createSQLQuery(sql)
                .addEntity(News.class)
                .list();
    }

    @Override
    public int queryPageCount(String hql, Object... objects) {
        //总页数
        Object obj = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql).uniqueResult();
        return Integer.parseInt(obj.toString());
    }
}
