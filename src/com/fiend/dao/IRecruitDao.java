package com.fiend.dao;

import com.fiend.entity.Recruit;

import java.util.List;

public interface IRecruitDao {
    //接口方法
    boolean addRecruit(Recruit recruitEnt);

    boolean updateRecruit(Recruit recruitEnt);

    boolean deleteRecruit(int recruitId);

    Recruit queryById(Recruit recruitEnt, int id);

    List<Recruit> queryByPerList(String hql);
    /**
     * 分页
     */
    List<Recruit> queryByPageList(String hql, Object... objects);

    /**
     * 返回数据总条数
     * @return
     */
    int queryPageCount(String hql, Object... objects);

    /**
     * 查找
     */
    List<Recruit> queryByNameAndSex(String hql);

}
