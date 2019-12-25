package com.fiend.dao.impl;

import com.fiend.dao.IRepairDao;
import com.fiend.entity.Repair;
import com.fiend.util.BaseDao;

import java.util.List;

public class RepairDaoImpl extends BaseDao implements IRepairDao {


    @Override
    public boolean addRepair(Repair repairEnt) {
        return super.commonSaveOrUpdate((repairEnt));
    }

    @Override
    public boolean updateRepair(Repair repairEnt) {
        super.update(repairEnt);
        return true;
    }

    @Override
    public boolean deleteRepair(int id) {
        Repair repairEnt = (Repair)super.commonGetObj(new Repair(),id);
        return super.commonDelete(repairEnt);
    }

    @Override
    public List<Repair> queryByPerList(String hql) {
        List<Repair> list = super.commonQuery(hql);
        return list;
    }

    @Override
    public Repair queryById(Repair repairEnt, int id) {
        return (Repair)super.commonGetObj(repairEnt,id);
    }

    @Override
    public List<Repair> queryPageList(String hql, Object... objects) {
            List<Repair> list = super.getSessionFactory().getCurrentSession()
                    .createSQLQuery(hql)
                    .addEntity(Repair.class)
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
    public List<Repair> queryByName(String hql) {
        List<Repair> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(Repair.class)
                .list();
        return list;
    }
}
