package com.fiend.dao;

import com.fiend.entity.News;

import java.util.List;

public interface INewsDao  {

    boolean addNews(News newsEnt);

    boolean updateNews(News newsEnt);

    boolean deleteNews(int id);

    List<News> queryByPerList(String hql);

    News queryById(News newsEnt, int id);


    List<News> queryPageList(String hql, Object... objects);

    int queryPageCount(String hql, Object... objects);

    List<News> queryByName(String hql);
}
