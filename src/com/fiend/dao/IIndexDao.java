package com.fiend.dao;

import com.fiend.entity.Company;
import com.fiend.entity.Servicecar;
import com.fiend.entity.Servicesmall;
import com.fiend.entity.Stock;

import java.util.List;

public interface IIndexDao {

    /**
     *      1.首页汽车轮播
     *      2.关于我们
     *      3.汽车保养
     *      4.服务类型
     *      5.配件产品
     */

    List<Servicecar> queryServiceCarList(String hql);

    Company queryCom(int comId);

    List<Servicesmall> queryServiceSmallList(String hql);

    List<Stock> queryStock(String hql);

}
