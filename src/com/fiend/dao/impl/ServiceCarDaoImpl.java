package com.fiend.dao.impl;

import com.fiend.dao.IServiceCarDao;
import com.fiend.entity.Servicecar;
import com.fiend.util.BaseDao;

import java.util.List;

public class ServiceCarDaoImpl extends BaseDao implements IServiceCarDao {
    @Override
    public boolean addServiceCar(Servicecar serviceCarEnt) {
        return super.commonSaveOrUpdate(serviceCarEnt);
    }

    @Override
    public boolean updateServiceCar(Servicecar serviceCarEnt) {
        super.update(serviceCarEnt);
        return true;
    }

    @Override
    public boolean deleteServiceCar(int ServiceCarId) {
        return super.commonDelete(super.commonGetObj(new Servicecar(),ServiceCarId));
    }

    @Override
    public Servicecar queryById(Servicecar serviceCarEnt, int id) {
        return (Servicecar) super.commonGetObj(serviceCarEnt,id);
    }

    @Override
    public List<Servicecar> queryByServiceCarList(String hql) {
        return commonQuery(hql);
    }

    @Override
    public List<Servicecar> queryByName(String hql) {
        List<Servicecar> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(Servicecar.class)
                .list();
        return list;
    }

    @Override
    public List<Servicecar> queryPageList(String hql, Object... objects) {
        List<Servicecar> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(Servicecar.class)
                .list();
        return list;
    }

    @Override
    public int queryPageCount(String hql, Object... objects) {
        Object obj = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .uniqueResult();
        return  Integer.parseInt(obj.toString());
    }
}
