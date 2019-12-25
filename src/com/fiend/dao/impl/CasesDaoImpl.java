package com.fiend.dao.impl;

import com.fiend.dao.ICasesDao;
import com.fiend.entity.Company;
import com.fiend.entity.Servicecar;
import com.fiend.util.BaseDao;

import java.util.List;

public class CasesDaoImpl extends BaseDao implements ICasesDao {
    @Override
    public Company queryCom(int comId) {
        return (Company) super.commonGetObj(new Company(),comId);
    }

    @Override
    public List<Servicecar> queryServiceCarList(String sql) {
        return super.getSessionFactory().getCurrentSession()
                .createSQLQuery(sql)
                .addEntity(Servicecar.class)
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
