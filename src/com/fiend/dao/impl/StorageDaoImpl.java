package com.fiend.dao.impl;

import com.fiend.dao.IStorageDao;
import com.fiend.entity.Storage;
import com.fiend.util.BaseDao;

import java.util.List;

public class StorageDaoImpl extends BaseDao implements IStorageDao {


    @Override
    public boolean addSto(Storage stoEnt) {
        //调用公共类添加方法
        boolean bool = super.commonSaveOrUpdate((stoEnt));
        return bool;
    }

    @Override
    public boolean updateSto(Storage stoEnt) {
        //调用公类共修改方法
        super.update(stoEnt);

        return false;
    }

    @Override
    public boolean deleteSto(int stoId) {
        Storage stoEnt = (Storage) super.commonGetObj(new Storage(), stoId);

        //调用公共类删除方法
        boolean bool = super.commonDelete(stoEnt);
        return bool;
    }

    @Override
    public Storage queryById(Storage stoEnt, int id) {
        //调用公共类查询方法
        Storage storage = (Storage) super.commonGetObj(stoEnt, id);
        return storage;
    }

    @Override
    public List<Storage> queryByStoList(String hql) {
        //查询所有数据集合
        List<Storage> list = super.commonQuery(hql);
        return list;
    }

    @Override
    public List<Storage> queryByName(String hql, Storage StoEnt) {
        //调用besDao
        String name = "%" + StoEnt.getName() + "%";
        List<Storage> list = super.commonQueryByName(hql, name);
        return list;
    }

    @Override
    public List<Storage> queryPageList(String hql, Object... objects) {
        List<Storage> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(Storage.class)
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
