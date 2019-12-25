package com.fiend.service;

import com.fiend.entity.Stock;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public interface IStockService {

    boolean addStock(Stock stockEnt);

    boolean updateStock(Stock stockEnt);

    boolean deleteStock(int stockId);

    Stock queryById(Stock stockEnt, int id);

    List<Stock> queryByStockList();

    List<Stock> queryByName(Stock stockEnt);

    /**
     * 分页
     * @param map
     * @return
     */
    PageModel<Stock> queryPageList(Map<String,Object> map);

}
