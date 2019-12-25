package com.fiend.dao.impl;

import com.fiend.dao.IStockDao;
import com.fiend.entity.Stock;
import com.fiend.util.BaseDao;

import java.util.List;

public class StockDaoImpl extends BaseDao implements IStockDao {

    /**
     * 添加数据方法
     *
     * @param stockEnt
     * @return
     */
    @Override
    public boolean addStock(Stock stockEnt) {

        return super.commonSaveOrUpdate(stockEnt);
    }

    @Override
    public boolean updateStock(Stock stockEnt) {
        super.update(stockEnt);
        return true;
    }

    @Override
    public boolean deleteStock(int stockId) {
        return super.commonDelete(super.commonGetObj(new Stock(), stockId));
    }

    @Override
    public Stock queryById(Stock stockEnt, int id) {
        return (Stock) super.commonGetObj(stockEnt, id);
    }

    @Override
    public List<Stock> queryByStockList(String hql) {
        return commonQuery(hql);
    }

    @Override
    public List<Stock> queryByName(String hql, Stock stockEnt) {
        //调用besDao
        String name = "%" + stockEnt.getFittingName() + "%";
        List<Stock> list = super.commonQueryByName(hql, name);
        return list;
    }

    @Override
    public List<Stock> queryPageList(String hql, Object... objects) {
        List<Stock> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(Stock.class)
                .list();
        return list;
    }

    @Override
    public int queryPageCount(String hql, Object... objects) {
        //总页数
        Object obj = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql).uniqueResult();
        return Integer.parseInt(obj.toString());
    }

}
