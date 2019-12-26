package com.fiend.action;

import com.fiend.entity.News;
import com.fiend.service.INewsService;
import com.fiend.util.PageModel;
import com.opensymphony.xwork2.ActionContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsAction {
    private News newsEnt;
    private INewsService newsService;
    private  int pageNo;
    private  int pageSize;

    public News getNewsEnt() {
        return newsEnt;
    }

    public void setNewsEnt(News newsEnt) {
        this.newsEnt = newsEnt;
    }

    public INewsService getNewsService() {
        return newsService;
    }

    public void setNewsService(INewsService newsService) {
        this.newsService = newsService;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String queryNewsList(){
        List<News> list = newsService.queryNewsList();
        ActionContext.getContext().put("list",list);
        return "queryNewsList";
    }

    public String queryById(){
        News retNewsEnt = newsService.queryById(newsEnt.getId());
        ActionContext.getContext().put("retNewsEnt",retNewsEnt);
        return "queryById";
    }

    public String updateSavePerEnt(){
        News news = newsService.queryById(newsEnt.getId());
        news.setContent(newsEnt.getContent());
        news.setNewstime(newsEnt.getNewstime());
        news.setStaffId(newsEnt.getStaffId());
        news.setTitle(newsEnt.getTitle());
        boolean bool = newsService.updateNews(news);
        if(bool){
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "caseDateSuccess";
        }else{
            return "caseDateError";
        }
    }

    public String deleteNewsEnt(){
        boolean bool = newsService.deleteNews(newsEnt.getId());
        if (bool) {
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "caseDateSuccess";
        }else {
            return "caseDateError";
        }
    }

    public String addNewsEnt(){
        boolean bool = newsService.addNews(newsEnt);
        if (bool){
            pageSize = 10;
            pageNo = 1;
            this.queryPageList();
            return "addNewsEnt";
        }else {
            return "errorInfo";
        }
    }

    public String queryByName(){
        Map<String,Object> map = new HashMap<>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);
        //调用service中分页方法
        PageModel<News> pg = newsService.queryByName(newsEnt,map);
        //存入当前页数
        pg.setPageNo(pageNo);
        //存入作用域
        ActionContext.getContext().put("pg",pg);

        return "queryByName";
    }

    public String queryPageList(){
        Map<String,Object> map = new HashMap<>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);
        //调用service中分页方法
        PageModel<News> pg = newsService.queryPageList(map);
        //存入当前页数
        pg.setPageNo(pageNo);
        //存入作用域
        ActionContext.getContext().put("pg",pg);

        return "queryPageList";
    }

    public String turnToPageAdd(){
        return "turnToPageAdd";
    }



}
