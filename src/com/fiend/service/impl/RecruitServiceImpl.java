package com.fiend.service.impl;

import com.fiend.dao.IRecruitDao;
import com.fiend.entity.Recruit;
import com.fiend.service.IRecruitService;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public class RecruitServiceImpl implements IRecruitService {

    //调用Dao层接口参数 生产get；set方法
    private IRecruitDao recruitDao;

    public IRecruitDao getRecruitDao() {return recruitDao; }

    public void setRecruitDao(IRecruitDao recruitDao) {this.recruitDao = recruitDao; }

    @Override
    public boolean addRecruit(Recruit recruitEnt) {
        //添加
        boolean bool = recruitDao.addRecruit(recruitEnt);
        return bool;
    }

    @Override
    public boolean updateRecruit(Recruit recruitEnt) {
        //修改
        boolean bool = recruitDao.updateRecruit(recruitEnt);
        return bool;
    }

    @Override
    public List<Recruit> queryRecruitList() {
        //查询语句拼写
        String hql = "select * from Recruit";
        List<Recruit> list = recruitDao.queryByPageList(hql);
        return list;
    }

    @Override
    public Recruit queryById(int recruitId) {
        Recruit recruitEnt = recruitDao.queryById(new Recruit(), recruitId);
        return recruitEnt;
    }

    @Override
    public boolean deletePerson(int recruitId) {
        //删除
        boolean bool = recruitDao.deleteRecruit(recruitId);
        return bool;
    }

    @Override
    public PageModel<Recruit> queryPageList(Map<String, Object> map) {
        //定义返对象
        PageModel<Recruit> pg = new PageModel<>();
        //调用列表+总条数 方法查询将结果放到 pg
        int pageNo = (int) map.get("pageNo");
        int pageSize = (int) map.get("pageSize");
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        StringBuffer hql = new StringBuffer("select * from Recruit where 1=1 limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(id) as countNum from Recruit");

        //查询
        List<Recruit> recruitList = recruitDao.queryByPageList(hql.toString());
        int totalNum = recruitDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(recruitList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);

        return pg;
    }

    @Override
    public PageModel<Recruit> queryByNameAndSex(Recruit recruitEnt, Map<String, Object> map) {
        //定义返对象
        PageModel<Recruit> pg = new PageModel<>();
        //调用列表+总条数 方法查询将结果放到 pg
        int pageNo = (int) map.get("pageNo");
        int pageSize = (int) map.get("pageSize");
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        String name = "'%" + recruitEnt.getName()+ "%'";
        StringBuffer hql = new StringBuffer("select * from Recruit where name like "+ name +" limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(id) as countNum from Recruit where name like "+name);

        //查询
        List<Recruit> recruitList = recruitDao.queryByNameAndSex(hql.toString());
        int totalNum = recruitDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(recruitList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);

        return pg;
    }
}
