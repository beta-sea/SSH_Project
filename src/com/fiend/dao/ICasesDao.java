package com.fiend.dao;

import com.fiend.entity.Company;
import com.fiend.entity.Servicecar;

import java.util.List;

public interface ICasesDao {

    Company queryCom(int comId);

    List<Servicecar> queryServiceCarList(String sql);

    int queryPageCount(String hql, Object ...objects);

}
