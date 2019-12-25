package com.fiend.dao;

import com.fiend.entity.Company;
import com.fiend.entity.News;

import java.util.List;

public interface INewsFontDao {

    Company queryCom(int comId);

    List<News> queryNewsList(String sql);

    int queryPageCount(String hql, Object ...objects);

}
