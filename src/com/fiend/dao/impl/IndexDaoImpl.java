package com.fiend.dao.impl;

import com.fiend.dao.IIndexDao;
import com.fiend.entity.Company;
import com.fiend.entity.Servicecar;
import com.fiend.entity.Servicesmall;
import com.fiend.entity.Stock;
import com.fiend.util.BaseDao;

import java.util.List;

public class IndexDaoImpl extends BaseDao implements IIndexDao {

    /**
     * 首页汽车轮播 服务类型
     * @param sql
     * @return
     */
    @Override
    public List<Servicecar> queryServiceCarList(String sql) {
        return super.getSessionFactory().getCurrentSession()
                .createSQLQuery(sql)
                .addEntity(Servicecar.class)
                .list();
    }

    /**
     * 关于我们
     * @param comId
     * @return
     */
    @Override
    public Company queryCom(int comId) {
        return (Company) super.commonGetObj(new Company(),comId);
    }


    /**
     * 汽车保养
     * @param sql
     * @return
     */
    @Override
    public List<Servicesmall> queryServiceSmallList(String sql) {
        return super.getSessionFactory().getCurrentSession()
                .createSQLQuery(sql)
                .addEntity(Servicesmall.class)
                .list();
    }

    /**
     * 配件产品
     * @param sql
     * @return
     */
    @Override
    public List<Stock> queryStock(String sql) {
        return super.getSessionFactory().getCurrentSession()
                .createSQLQuery(sql)
                .addEntity(Stock.class)
                .list();
    }

}
