package com.fiend.dao;

import com.fiend.entity.Leaving;

import java.util.List;

public interface ILeavingDao {

    boolean addLeaving(Leaving leavingEnt);

    boolean updateLeaving(Leaving leavingEnt);

    boolean deleteLeaving(int leavingId);

    Leaving queryById(Leaving leavingEnt, int id);

    List<Leaving> queryByLeavingList(String hql);

    List<Leaving> queryByMessageUser(String hql, Leaving leavingEnt);

    /**
     * 查询分页
     *
     * @return
     */
    List<Leaving> queryPageList(String hql, Object ...objects);

    /**
     * 返回数据总条数
     *
     * @return
     */
    int queryPageCount(String hql, Object ...objects);
    
}
