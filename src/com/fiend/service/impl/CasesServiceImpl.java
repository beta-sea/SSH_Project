package com.fiend.service.impl;

import com.fiend.dao.ICasesDao;
import com.fiend.entity.Company;
import com.fiend.entity.Servicecar;
import com.fiend.service.ICasesService;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public class CasesServiceImpl implements ICasesService {

    private ICasesDao casesDao;

    public ICasesDao getCasesDao() {
        return casesDao;
    }

    public void setCasesDao(ICasesDao casesDao) {
        this.casesDao = casesDao;
    }

    @Override
    public Company queryCom(int comId) {
        return casesDao.queryCom(comId);
    }

    @Override
    public PageModel<Servicecar> queryPageList(Map<String, Object> map) {
        //定义返回对象
        PageModel<Servicecar> pg = new PageModel<>();
        //调用列表+总条数 方法查询 将结果放到 pg
        String[] arrNO = (String[]) map.get("pageNo");
        int pageNo = Integer.parseInt(arrNO[0]);
        String[] arrSize = (String[]) map.get("pageSize");
        int pageSize = Integer.parseInt(arrSize[0]);
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        StringBuffer hql = new StringBuffer("select * from Servicecar where 1=1 limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(vehicleId) as counNum from Servicecar");

        //查询
        List<Servicecar> pageList = casesDao.queryServiceCarList(hql.toString());
        int totalNum = casesDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(pageList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);
        return pg;
    }
}
