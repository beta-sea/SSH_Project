package com.fiend.service.impl;

import com.fiend.dao.IIndexDao;
import com.fiend.entity.Company;
import com.fiend.entity.Servicecar;
import com.fiend.entity.Servicesmall;
import com.fiend.entity.Stock;
import com.fiend.service.IIndexService;

import java.util.List;

public class IndexServiceImpl implements IIndexService {

    IIndexDao indexDao;

    public IIndexDao getIndexDao() {
        return indexDao;
    }

    public void setIndexDao(IIndexDao indexDao) {
        this.indexDao = indexDao;
    }



    @Override
    public List<Servicecar> listServiceCar() {
        String hql = "select * from servicecar limit 0,3";
        return indexDao.queryServiceCarList(hql);
    }

    @Override
    public Company queryCom(int comId) {
        return indexDao.queryCom(comId);
    }

    @Override
    public List<Servicesmall> serviceSmallList() {
        String hql = "select * from servicesmall limit 0,1";
        return indexDao.queryServiceSmallList(hql);
    }

    @Override
    public List<Stock> queryStock() {
        String hql = "select * from stock limit 0,8";
        return indexDao.queryStock(hql);
    }
}
