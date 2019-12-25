package com.fiend.service;

import com.fiend.entity.Repair;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public interface IRepairService {

    boolean addRepair(Repair repairEnt);

    boolean updateRepair(Repair repairEnt);

    List<Repair> queryRepairList();

    Repair queryById(int id);

    boolean deleteRepair(int id);

    PageModel<Repair> queryPageList(Map<String, Object> map);

    PageModel<Repair> queryByName(Repair repairEnt, Map<String, Object> map);

}
