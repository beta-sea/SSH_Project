package com.fiend.service;

import com.fiend.entity.Servicesmall;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public interface IServiceSmallService {

    boolean addServiceSmall(Servicesmall serviceSmallEnt);

    boolean updateServiceSmall(Servicesmall serviceSmallEnt);

    List<Servicesmall> queryServiceSmallList();

    Servicesmall queryById(int serviceSmallId);

    boolean deleteServiceSmall(int serviceSmallId);

    PageModel<Servicesmall> queryPageList(Map<String, Object> map);

    PageModel<Servicesmall> queryByName(Servicesmall serviceSmallEnt, Map<String, Object> map);
}
