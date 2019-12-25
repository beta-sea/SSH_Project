package com.fiend.dao;


import com.fiend.entity.Servicesmall;

import java.util.List;

public interface IServiceSmallDao {
    boolean addServiceSmall(Servicesmall serviceSmallEnt);

    boolean updateServiceSmall(Servicesmall serviceSmallEnt);

    boolean deleteServiceSmall(int serviceSmallId);

    List<Servicesmall> queryByPerList(String hql);

    Servicesmall queryById(Servicesmall serviceSmallEnt, int id);


    List<Servicesmall> queryPageList(String hql, Object... objects);

    int queryPageCount(String hql, Object... objects);

    List<Servicesmall> queryByName(String hql);


}
