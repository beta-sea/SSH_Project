package com.fiend.dao;

import com.fiend.entity.Repair;

import java.util.List;

public interface IRepairDao {
    boolean addRepair(Repair repairEnt);

    boolean updateRepair(Repair repairEnt);

    boolean deleteRepair(int id);

    List<Repair> queryByPerList(String hql);

    Repair queryById(Repair repairEnt, int id);


    List<Repair> queryPageList(String hql, Object... objects);

    int queryPageCount(String hql, Object... objects);

    List<Repair> queryByName(String hql);
}
