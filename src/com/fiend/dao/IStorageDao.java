package com.fiend.dao;

import com.fiend.entity.Storage;

import java.util.List;

public interface IStorageDao {

    boolean addSto(Storage stoEnt);

    boolean updateSto(Storage StoEnt);

    boolean deleteSto(int stoId);

    Storage queryById(Storage stoEnt, int id);

    List<Storage> queryByStoList(String hql);

    List<Storage> queryByName(String hql, Storage stoEnt);

    /**
     * 查询分页
     *
     * @return
     */
    List<Storage> queryPageList(String hql, Object ...objects);

    /**
     * 返回数据总条数
     *
     * @return
     */
    int queryPageCount(String hql, Object ...objects);

}
