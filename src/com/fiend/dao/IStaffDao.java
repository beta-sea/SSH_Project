package com.fiend.dao;

import com.fiend.entity.Admin;
import com.fiend.entity.Staff;

import java.util.List;

public interface IStaffDao {
    //    接口方法
    boolean addStaff(Staff staffEnt);

    boolean updateStaff(Staff StaffEnt);

    boolean deleteStaff(int staffId);

    Staff queryById(Staff staffEnt, int id);

    /***
     * 登录
     * @param hql
     * @param loginName
     * @param Pwd
     * @return
     */
    List<Admin> queryByName(String hql, String loginName, String Pwd);

    List<Staff> queryByPerList(String hql);

    List<Staff> queryByNameAndSex(String hql, Staff staffEnt);

    /**
     * 查询分页
     *
     * @return
     */
    List<Staff> queryPageList(String hql, Object ...objects);

    /**
     * 返回数据总条数
     *
     * @return
     */
    int queryPageCount(String hql, Object ...objects);
}
