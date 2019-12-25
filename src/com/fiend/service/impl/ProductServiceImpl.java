package com.fiend.service.impl;

import com.fiend.dao.IProductDao;
import com.fiend.entity.Company;
import com.fiend.entity.Stock;
import com.fiend.service.IProductService;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements IProductService {

    private IProductDao productDao;

    public IProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(IProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Company queryCom(int comId) {
        return productDao.queryCom(comId);
    }

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
        List<Stock> pageList = productDao.queryStockList(hql.toString());
        int totalNum = productDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(pageList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);
        return pg;
    }
}
