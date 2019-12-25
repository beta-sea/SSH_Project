package com.fiend.service.impl;

import com.fiend.dao.IStockDao;
import com.fiend.entity.Stock;
import com.fiend.service.IStockService;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public class StockServiceImpl implements IStockService {

    private IStockDao stockDao;

    public IStockDao getStockDao() {
        return stockDao;
    }
    public void setStockDao(IStockDao stockDao) {
        this.stockDao = stockDao;
    }

    /**
     * 增加
     * @param stockEnt
     * @return
     */
    @Override
    public boolean addStock(Stock stockEnt) {
        return stockDao.addStock(stockEnt);
    }

    /**
     * 修改
     * @param stockEnt
     * @return
     */
    @Override
    public boolean updateStock(Stock stockEnt) {
        return stockDao.updateStock(stockEnt);
    }

    /**
     * 删除
     * @param stockId
     * @return
     */
    @Override
    public boolean deleteStock(int stockId) {
        return stockDao.deleteStock(stockId);
    }

    /**
     * id查询
     * @param stockEnt
     * @param id
     * @return
     */
    @Override
    public Stock queryById(Stock stockEnt, int id) {
        return stockDao.queryById(stockEnt,id);
    }

    /**
     * 查询list
     * @return
     */
    @Override
    public List<Stock> queryByStockList() {
        //查询语句拼写
        String hql = "from Stock";
        List<Stock> list = stockDao.queryByStockList(hql);
        return list;
    }

    /**
     * 添加查询
     * @param stockEnt
     * @return
     */
    @Override
    public List<Stock> queryByName(Stock stockEnt) {
        //定义查询hql语句
        String hql = "from Stock where name like ?";
        //调用查询方法
        List<Stock> list = stockDao.queryByName(hql, stockEnt);
        return list;
    }

    /**
     * 分页
     * @param map
     * @return
     */
    @Override
    public PageModel<Stock> queryPageList(Map<String, Object> map) {
        //定义返回对象
        PageModel<Stock> pg = new PageModel<>();
        //调用列表+总条数 方法查询 将结果放到 pg
        String[] arrNO = (String[]) map.get("pageNo");
        int pageNo = Integer.parseInt(arrNO[0]);
        String[] arrSize = (String[]) map.get("pageSize");
        int pageSize = Integer.parseInt(arrSize[0]);
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        StringBuffer hql = new StringBuffer("select * from Stock where 1=1 limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(fittingId) as counNum from Stock");

        //查询
        List<Stock> pageList = stockDao.queryPageList(hql.toString());
        int totalNum = stockDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(pageList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);
        return pg;
    }

}
