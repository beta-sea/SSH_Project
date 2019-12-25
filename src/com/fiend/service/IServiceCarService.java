package com.fiend.service;

import com.fiend.entity.Servicecar;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public interface IServiceCarService {
    boolean addServiceCar(Servicecar serviceCarEnt);
    
    boolean updateServiceCar(Servicecar serviceCarEnt);

    boolean deleteServiceCar(int serviceCarId);

    Servicecar queryById(int id);

    List<Servicecar> queryByServiceCarList();

    PageModel<Servicecar> queryByName(Servicecar serviceCarEnt, Map<String, Object> map);

    /**
     * 分页
     * @param map
     * @return
     */
    PageModel<Servicecar> queryPageList(Map<String, Object> map);
}
