package com.fiend.dao.impl;

import com.fiend.dao.IServiceSmallDao;
import com.fiend.entity.Servicesmall;
import com.fiend.util.BaseDao;

import java.util.List;

public class ServiceSmallDaoImpl extends BaseDao implements IServiceSmallDao {
    @Override
    public boolean addServiceSmall(Servicesmall serviceSmallEnt) {
        boolean bool = super.commonSaveOrUpdate((serviceSmallEnt));
        return bool;
    }

    @Override
    public boolean updateServiceSmall(Servicesmall serviceSmallEnt) {
        super.update(serviceSmallEnt);
        return true;
    }

    @Override
    public boolean deleteServiceSmall(int serviceSmallId) {
        Servicesmall servicesmallEnt = (Servicesmall)super.commonGetObj(new Servicesmall(),serviceSmallId);
        boolean bool = super.commonDelete(servicesmallEnt);
        return bool;
    }

    @Override
    public List<Servicesmall> queryByPerList(String hql) {
        List<Servicesmall> list = super.commonQuery(hql);
        return list;
    }


    @Override
    public Servicesmall queryById(Servicesmall serviceSmallEnt, int id) {
        Servicesmall servicesmall = (Servicesmall)super.commonGetObj(serviceSmallEnt,id);
        return servicesmall;
    }



    @Override
    public List<Servicesmall> queryPageList(String hql, Object... objects) {
        List<Servicesmall> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(Servicesmall.class)
                .list();
        return list;
    }

    @Override
    public int queryPageCount(String hql, Object... objects) {
        Object obj = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql).uniqueResult();
        return Integer.parseInt(obj.toString());
    }

    @Override
    public List<Servicesmall> queryByName(String hql) {
        List<Servicesmall> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(Servicesmall.class)
                .list();
        return list;
    }


}
