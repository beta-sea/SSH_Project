package com.fiend.service.impl;

import com.fiend.dao.IServiceCarDao;
import com.fiend.entity.Servicecar;
import com.fiend.service.IServiceCarService;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public class ServiceCarServiceImpl implements IServiceCarService {
    private IServiceCarDao serviceCarDao;

    public IServiceCarDao getServiceCarDao() {
        return serviceCarDao;
    }

    public void setServiceCarDao(IServiceCarDao serviceCarDao) {
        this.serviceCarDao = serviceCarDao;
    }

    @Override
    public boolean addServiceCar(Servicecar serviceCarEnt) {
        return serviceCarDao.addServiceCar(serviceCarEnt);
    }

    @Override
    public boolean updateServiceCar(Servicecar serviceCarEnt) {
        return serviceCarDao.updateServiceCar(serviceCarEnt);
    }

    @Override
    public boolean deleteServiceCar(int serviceCarId) {
        return serviceCarDao.deleteServiceCar(serviceCarId);
    }

    @Override
    public Servicecar queryById( int id) {
        return serviceCarDao.queryById(new Servicecar(),id);
    }

    @Override
    public List<Servicecar> queryByServiceCarList() {
        String hql = "from servicecar";
        List<Servicecar> list = serviceCarDao.queryByServiceCarList(hql);
        return list;

    }

    @Override
    public PageModel<Servicecar> queryByName(Servicecar serviceCarEnt, Map<String, Object> map) {
        PageModel<Servicecar> pg = new PageModel<>();
        //调用列表+总条数 方法查询将结果放到 pg
        String[] arrNO = (String[]) map.get("pageNo");
        int pageNo = Integer.parseInt(arrNO[0]);
        String[] arrSize = (String[]) map.get("pageSize");
        int pageSize = Integer.parseInt(arrSize[0]);
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        String name = "'%" + serviceCarEnt.getVehicleName()+ "%'";
        StringBuffer hql = new StringBuffer("select * from servicecar where vehiclename like "+ name +" limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(vehicleid) as countNum from servicecar where vehiclename like "+name);

        //查询
        List<Servicecar> serviceCarList = serviceCarDao.queryByName(hql.toString());
        int totalNum = serviceCarDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(serviceCarList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);
        return pg;
    }

    @Override
    public PageModel<Servicecar> queryPageList(Map<String, Object> map) {
        PageModel<Servicecar> pg = new PageModel<>();
        //调用列表+总条数 方法查询将结果放到 pg
        String[] arrNO = (String[]) map.get("pageNo");
        int pageNo = Integer.parseInt(arrNO[0]);
        String[] arrSize = (String[]) map.get("pageSize");
        int pageSize = Integer.parseInt(arrSize[0]);
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        StringBuffer hql = new StringBuffer("select * from servicecar where 1=1 limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(vehicleid) as countNum from servicecar");

        //查询
        List<Servicecar> serviceCarList = serviceCarDao.queryPageList(hql.toString());
        int totalNum = serviceCarDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(serviceCarList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);

        return pg;
    }
}
