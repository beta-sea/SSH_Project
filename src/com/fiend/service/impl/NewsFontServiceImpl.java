package com.fiend.service.impl;

import com.fiend.dao.INewsFontDao;
import com.fiend.entity.Company;
import com.fiend.entity.News;
import com.fiend.service.INewsFontService;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public class NewsFontServiceImpl implements INewsFontService {

    private INewsFontDao newsFontDao;

    public INewsFontDao getNewsFontDao() {
        return newsFontDao;
    }

    public void setNewsFontDao(INewsFontDao newsFontDao) {
        this.newsFontDao = newsFontDao;
    }

    @Override
    public Company queryCom(int comId) {
        return newsFontDao.queryCom(comId);
    }

    @Override
    public PageModel<News> queryPageList(Map<String, Object> map) {
        //定义返回对象
        PageModel<News> pg = new PageModel<>();
        //调用列表+总条数 方法查询 将结果放到 pg
        String[] arrNO = (String[]) map.get("pageNo");
        int pageNo = Integer.parseInt(arrNO[0]);
        String[] arrSize = (String[]) map.get("pageSize");
        int pageSize = Integer.parseInt(arrSize[0]);
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        StringBuffer hql = new StringBuffer("select * from News where 1=1 limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(id) as counNum from News");

        //查询
        List<News> pageList = newsFontDao.queryNewsList(hql.toString());
        int totalNum = newsFontDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(pageList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);
        return pg;
    }
}
