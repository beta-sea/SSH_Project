package com.fiend.dao.impl;


import com.fiend.dao.IJoinUsDao;
import com.fiend.entity.Company;
import com.fiend.entity.Post;
import com.fiend.entity.Recruit;
import com.fiend.util.BaseDao;

import java.util.List;

public class JoinUsDaoImpl  extends BaseDao implements IJoinUsDao {

    @Override
    public Company queryCom(int comId) {
        return (Company) super.commonGetObj(new Company(),comId);
    }

    @Override
    public List<Post> queryPostList(String sql) {
        return super.getSessionFactory().getCurrentSession()
                .createSQLQuery(sql)
                .addEntity(Post.class)
                .list();
    }

    @Override
    public boolean addRecruit(Recruit recruitEnt) {
        boolean bool = super.commonSaveOrUpdate((recruitEnt));
        return bool;
    }

    @Override
    public int queryPageCount(String hql, Object... objects) {
        //总页数
        Object obj = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql).uniqueResult();
        return Integer.parseInt(obj.toString());
    }

}
