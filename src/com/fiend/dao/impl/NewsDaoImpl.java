package com.fiend.dao.impl;

import com.fiend.dao.INewsDao;
import com.fiend.entity.News;
import com.fiend.util.BaseDao;

import java.util.List;

public class NewsDaoImpl extends BaseDao implements INewsDao {
    @Override
    public boolean addNews(News newsEnt) {
        boolean bool = super.commonSaveOrUpdate((newsEnt));
        return bool;
    }

    @Override
    public boolean updateNews(News newsEnt) {
        super.update(newsEnt);
        return true;
    }

    @Override
    public boolean deleteNews(int id) {
        News newsEnt = (News)super.commonGetObj(new News(),id);
        boolean bool = super.commonDelete(newsEnt);
        return bool;
    }

    @Override
    public List<News> queryByPerList(String hql) {
        return super.commonQuery(hql);
    }

    @Override
    public News queryById(News newsEnt, int id) {
        return (News)super.commonGetObj(newsEnt,id);
    }

    @Override
    public List<News> queryPageList(String hql, Object... objects) {
        List<News> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(News.class)
                .list();
        return list;
    }

    @Override
    public int queryPageCount(String hql, Object... objects) {
        Object obj = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql).uniqueResult();
        return Integer.parseInt(obj.toString());
    }

    @Override
    public List<News> queryByName(String hql) {
        List<News> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(News.class)
                .list();
        return list;
    }
}
