package com.fiend.service;

import com.fiend.entity.Leaving;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public interface ILeavingService {

    boolean addLeaving(Leaving leavingEnt);

    boolean updateLeaving(Leaving leavingEnt);

    boolean deleteLeaving(int leavingId);

    Leaving queryById(Leaving leavingEnt, int id);

    List<Leaving> queryByLeavingList();

    List<Leaving> queryByMessageUser(Leaving leavingEnt);

    /**
     * 分页
     * @param map
     * @return
     */
    PageModel<Leaving> queryPageList(Map<String,Object> map);
    
}
