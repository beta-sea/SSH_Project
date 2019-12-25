package com.fiend.service.impl;

import com.fiend.dao.IServiceSmallDao;
import com.fiend.entity.Servicesmall;
import com.fiend.service.IServiceSmallService;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public class ServiceSmallServiceImpl implements IServiceSmallService {
    private IServiceSmallDao serviceSmallDao;

    public IServiceSmallDao getServiceSmallDao() {
        return serviceSmallDao;
    }

    public void setServiceSmallDao(IServiceSmallDao serviceSmallDao) {
        this.serviceSmallDao = serviceSmallDao;
    }

    @Override
    public boolean addServiceSmall(Servicesmall serviceSmallEnt) {
        boolean bool = serviceSmallDao.addServiceSmall(serviceSmallEnt);
        return bool;
    }

    @Override
    public boolean updateServiceSmall(Servicesmall serviceSmallEnt) {
        boolean bool = serviceSmallDao.updateServiceSmall(serviceSmallEnt);
        return bool;
    }

    @Override
    public List<Servicesmall> queryServiceSmallList() {
        String hql = "from Servicesmall";
        List<Servicesmall> list = serviceSmallDao.queryByPerList(hql);
        return list;

    }

    @Override
    public Servicesmall queryById(int serviceSmallId) {
        Servicesmall serviceSmallEnt = serviceSmallDao.queryById(new Servicesmall(),serviceSmallId);
        return serviceSmallEnt;
    }

    @Override
    public boolean deleteServiceSmall(int serviceSmallId) {
        boolean bool = serviceSmallDao.deleteServiceSmall(serviceSmallId);
        return bool;
    }

    @Override
    public PageModel<Servicesmall> queryPageList(Map<String, Object> map) {
        //定义返回对象
        PageModel<Servicesmall> pg = new PageModel<>();
        //调用列表+总条数 方法查询 将结果放到 pg
        int pageNo = (int) map.get("pageNo");
        int pageSize = (int) map.get("pageSize");
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        StringBuffer hql = new StringBuffer("select * from Servicesmall where 1=1 limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(serviceSmallId) as counNum from Servicesmall");

        //查询
        List<Servicesmall> pageList = serviceSmallDao.queryPageList(hql.toString());
        int totalNum = serviceSmallDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(pageList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);

        return pg;
    }

    @Override
    public PageModel<Servicesmall> queryByName(Servicesmall serviceSmallEnt,Map<String, Object> map) {
        PageModel<Servicesmall> pg = new PageModel<>();
        int pageNo = (int) map.get("pageNo");
        int pageSize = (int) map.get("pageSize");
        int beginNum = (pageNo - 1) * pageSize;
        String name = "'%"+serviceSmallEnt.getName()+"%'";
        StringBuffer hql = new StringBuffer("select * from servicesmall where name like "+ name + " limit "+ beginNum +","+pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(serviceSmallId) as countNum from servicesmall where name like "+name);
        List<Servicesmall> serviceSmallList = serviceSmallDao.queryByName(hql.toString());
        int totalNum = serviceSmallDao.queryPageCount(hqlCount.toString());
        pg.setList(serviceSmallList);
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);
        return pg;
    }


}
