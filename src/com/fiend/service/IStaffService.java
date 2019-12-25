package com.fiend.service;



import com.fiend.entity.Admin;
import com.fiend.entity.Staff;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public interface IStaffService {
    /**
     * 添加修改
     * @param staffEnt
     * @return
     */
    boolean addStaff(Staff staffEnt);

    boolean updateStaff(Staff staffEnt);

    /**
     * 登录查询
     * @param loginName
     * @param loginPwd
     * @return
     */
    Admin queryAd(String loginName, String loginPwd);

    /**
     * 列表查询
     * @return
     */
    List<Staff> queryStaffList();

    /**
     * 条件查询方法
     * @param staffEnt staffEnt.name staffEnt.sex
     * @return
     */
    List<Staff> queryByNameAndSex(Staff staffEnt);

    /**
     * 通过id查询
     * @param staffId
     * @return 实体对象
     */
    Staff queryById(int staffId);

    /**
     * 删除
     * @param staffId
     * @return
     */
    boolean deletePerson(int staffId);

    /**
     * 分页
     * @param map
     * @return
     */
    PageModel<Staff> queryPageList(Map<String,Object> map);
}
