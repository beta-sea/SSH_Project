package com.fiend.service.impl;

import com.fiend.dao.INewsDao;
import com.fiend.entity.News;
import com.fiend.service.INewsService;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public class NewsServiceImpl implements INewsService {
    private INewsDao newsDao;

    public INewsDao getNewsDao() {
        return newsDao;
    }

    public void setNewsDao(INewsDao newsDao) {
        this.newsDao = newsDao;
    }

    @Override
    public boolean addNews(News newsEnt) {
        return newsDao.addNews(newsEnt);
    }

    @Override
    public boolean updateNews(News newsEnt) {
        return newsDao.updateNews(newsEnt);
    }

    @Override
    public List<News> queryNewsList() {
        String hql = "from news";
        List<News> list = newsDao.queryByPerList(hql);
        return list;
    }

    @Override
    public News queryById(int id) {
        return newsDao.queryById(new News(),id);
    }

    @Override
    public boolean deleteNews(int id) {
        return newsDao.deleteNews(id);
    }

    @Override
    public PageModel<News> queryPageList(Map<String, Object> map) {
        PageModel<News> pg = new PageModel<>();
        //调用列表+总条数 方法查询 将结果放到 pg
        int pageNo = (int) map.get("pageNo");
        int pageSize = (int) map.get("pageSize");
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        StringBuffer hql = new StringBuffer("select * from news where 1=1 limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(id) as counNum from news");

        //查询
        List<News> pageList = newsDao.queryPageList(hql.toString());
        int totalNum = newsDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(pageList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);

        return pg;
    }

    @Override
    public PageModel<News> queryByName(News newsEnt, Map<String, Object> map) {
        PageModel<News> pg = new PageModel<>();
        int pageNo = (int) map.get("pageNo");
        int pageSize = (int) map.get("pageSize");
        int beginNum = (pageNo - 1) * pageSize;
        String name = "'%"+newsEnt.getTitle()+"%'";
        StringBuffer hql = new StringBuffer("select * from news where title like "+ name + " limit "+ beginNum +","+pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(id) as countNum from news where title like "+name);
        List<News> serviceSmallList = newsDao.queryByName(hql.toString());
        int totalNum = newsDao.queryPageCount(hqlCount.toString());
        pg.setList(serviceSmallList);
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);
        return pg;    }
}
