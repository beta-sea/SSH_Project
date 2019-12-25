package com.fiend.service;

import com.fiend.entity.Recruit;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public interface IRecruitService {
    /**
     * 添加修改
     */
    boolean addRecruit(Recruit recruitEnt);

    boolean updateRecruit(Recruit recruitEnt);

    /**
     * 列表查询
     */
    List<Recruit> queryRecruitList();

    /**
     * 通过id查询
     */
    Recruit queryById(int recruitId);

    /**
     * 删除
     */
    boolean deletePerson(int recruitId);

    /**
     * 分页
     */
    PageModel<Recruit> queryPageList(Map<String, Object> map);

    /**
     * 查询
     */
    PageModel<Recruit> queryByNameAndSex(Recruit recruitEnt, Map<String, Object> map);
}
