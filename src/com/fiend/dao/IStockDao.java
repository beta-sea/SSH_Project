package com.fiend.dao;

import com.fiend.entity.Stock;

import java.util.List;

public interface IStockDao {

    boolean addStock(Stock stockEnt);

    boolean updateStock(Stock stockEnt);

    boolean deleteStock(int stockId);

    Stock queryById(Stock stockEnt, int id);

    List<Stock> queryByStockList(String hql);

    List<Stock> queryByName(String hql, Stock stockEnt);

    /**
     * 查询分页
     *
     * @return
     */
    List<Stock> queryPageList(String hql, Object ...objects);

    /**
     * 返回数据总条数
     *
     * @return
     */
    int queryPageCount(String hql, Object ...objects);

}
