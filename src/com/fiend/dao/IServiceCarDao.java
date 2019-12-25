package com.fiend.dao;

import com.fiend.entity.Servicecar;

import java.util.List;

public interface IServiceCarDao {
    boolean addServiceCar(Servicecar serviceCarEnt);
    
    boolean updateServiceCar(Servicecar serviceCarEnt);
    
    boolean deleteServiceCar(int ServiceCarId);
    
    Servicecar queryById(Servicecar serviceCarEnt, int id);
    
    
    List<Servicecar> queryByServiceCarList(String hql);

    List<Servicecar> queryByName(String hql);

    /**
     * 查询分页
     *
     * @return
     */
    List<Servicecar> queryPageList(String hql, Object... objects);

    /**
     * 返回数据总条数
     *
     * @return
     */
    int queryPageCount(String hql, Object... objects);
    
    
}
