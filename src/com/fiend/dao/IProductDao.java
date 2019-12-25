package com.fiend.dao;

import com.fiend.entity.Company;
import com.fiend.entity.Stock;

import java.util.List;

public interface IProductDao {

    Company queryCom(int comId);

    List<Stock> queryStockList(String sql);

    int queryPageCount(String hql, Object ...objects);

}
