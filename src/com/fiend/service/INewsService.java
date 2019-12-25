package com.fiend.service;

import com.fiend.entity.News;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public interface INewsService {
    boolean addNews(News newsEnt);

    boolean updateNews(News newsEnt);

    List<News> queryNewsList();

    News queryById(int id);

    boolean deleteNews(int id);

    PageModel<News> queryPageList(Map<String, Object> map);

    PageModel<News> queryByName(News newsEnt, Map<String, Object> map);

}
