package com.fiend.dao.impl;

import com.fiend.dao.ILeavingDao;
import com.fiend.entity.Leaving;
import com.fiend.util.BaseDao;

import java.util.List;

public class LeavingDaoImpl extends BaseDao implements ILeavingDao {
    @Override
    public boolean addLeaving(Leaving leavingEnt) {
        return super.commonSaveOrUpdate(leavingEnt);
    }

    @Override
    public boolean updateLeaving(Leaving leavingEnt) {
        super.update(leavingEnt);
        return true;
    }

    @Override
    public boolean deleteLeaving(int leavingId) {
        return super.commonDelete(super.commonGetObj(new Leaving(), leavingId));
    }

    @Override
    public Leaving queryById(Leaving leavingEnt, int id) {
        return (Leaving) super.commonGetObj(leavingEnt, id);
    }

    @Override
    public List<Leaving> queryByLeavingList(String hql) {
        return commonQuery(hql);
    }

    @Override
    public List<Leaving> queryByMessageUser(String hql, Leaving leavingEnt) {
        //调用besDao
        String name = "%" + leavingEnt.getMessageUser() + "%";
        List<Leaving> list = super.commonQueryByName(hql, name);
        return list;
    }

    @Override
    public List<Leaving> queryPageList(String hql, Object... objects) {
        List<Leaving> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(Leaving.class)
                .list();
        return list;
    }

    @Override
    public int queryPageCount(String hql, Object... objects) {
        //总页数
        Object obj = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql).uniqueResult();
        return Integer.parseInt(obj.toString());
    }
}
