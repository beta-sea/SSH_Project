package com.fiend.service.impl;

import com.fiend.dao.IJoinUsDao;
import com.fiend.entity.Company;
import com.fiend.entity.Post;
import com.fiend.entity.Recruit;
import com.fiend.service.IJoinUsService;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public class JoinUsServiceImpl implements IJoinUsService {

    private IJoinUsDao joinUsDao;

    public IJoinUsDao getJoinUsDao() {
        return joinUsDao;
    }

    public void setJoinUsDao(IJoinUsDao joinUsDao) {
        this.joinUsDao = joinUsDao;
    }


    @Override
    public Company queryCom(int comId) {
        return joinUsDao.queryCom(comId);
    }

    @Override
    public boolean addRecruit(Recruit recruitEnt) {
        boolean bool = joinUsDao.addRecruit(recruitEnt);
        return bool;
    }

    @Override
    public PageModel<Post> queryPageList(Map<String, Object> map) {
        //定义返回对象
        PageModel<Post> pg = new PageModel<>();
        //调用列表+总条数 方法查询 将结果放到 pg
        String[] arrNO = (String[]) map.get("pageNo");
        int pageNo = Integer.parseInt(arrNO[0]);
        String[] arrSize = (String[]) map.get("pageSize");
        int pageSize = Integer.parseInt(arrSize[0]);
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        StringBuffer hql = new StringBuffer("select * from Post where 1=1 limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(id) as counNum from Post");

        //查询
        List<Post> pageList = joinUsDao.queryPostList(hql.toString());
        int totalNum = joinUsDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(pageList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);
        return pg;
    }
}
