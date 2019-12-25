package com.fiend.service;

import com.fiend.entity.Storage;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public interface IStorageService {

    boolean addSto(Storage stoEnt);

    boolean updateSto(Storage StoEnt);

    boolean deleteSto(int stoId);

    Storage queryById(int id);

    List<Storage> queryByStoList();

    List<Storage> queryByName(Storage stoEnt);

    /**
     * 分页
     *
     * @param map
     * @return
     */
    PageModel<Storage> queryPageList(Map<String, Object> map);

}
