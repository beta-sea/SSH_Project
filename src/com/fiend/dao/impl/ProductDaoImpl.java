package com.fiend.dao.impl;

import com.fiend.dao.IProductDao;
import com.fiend.entity.Company;
import com.fiend.entity.Stock;
import com.fiend.util.BaseDao;

import java.util.List;

public class ProductDaoImpl extends BaseDao implements IProductDao {

    @Override
    public Company queryCom(int comId) {
        return (Company) super.commonGetObj(new Company(),comId);
    }

    @Override
    public List<Stock> queryStockList(String sql) {
        return super.getSessionFactory().getCurrentSession()
                .createSQLQuery(sql)
                .addEntity(Stock.class)
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
