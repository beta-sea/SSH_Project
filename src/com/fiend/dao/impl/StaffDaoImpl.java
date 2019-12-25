package com.fiend.dao.impl;

import com.fiend.dao.IStaffDao;

import com.fiend.entity.Admin;
import com.fiend.entity.Staff;
import com.fiend.util.BaseDao;

import java.util.List;

public class StaffDaoImpl extends BaseDao implements IStaffDao {

    @Override
    public boolean addStaff(Staff staffEnt) {
        //调用公共类添加方法
        boolean bool = super.commonSaveOrUpdate((staffEnt));
        return bool;
    }

    @Override
    public boolean updateStaff(Staff staffEnt) {
        //调用公类共修改方法
        super.update(staffEnt);

        return true;
    }

    @Override
    public boolean deleteStaff(int staffId) {
        Staff staffEnt = (Staff) super.commonGetObj(new Staff(), staffId);

        //调用公共类删除方法
        boolean bool = super.commonDelete(staffEnt);
        return bool;
    }

    @Override
    public Staff queryById(Staff staffEnt, int id) {
        //调用公共类查询方法
        Staff staff = (Staff) super.commonGetObj(staffEnt, id);
        return staff;
    }

    @Override
    public List<Admin> queryByName(String hql, String loginName, String loginPwd) {
        //登录查询对象是否存在
        List<Admin> list = super.commonQueryByName(hql, loginName, loginPwd);
        return list;
    }

    @Override
    public List<Staff> queryByPerList(String hql) {
        //查询所有数据集合
        List<Staff> list = super.commonQuery(hql);
        return list;
    }

    @Override
    public List<Staff> queryByNameAndSex(String hql, Staff staffEnt) {
        //调用besDao
        String name = "%" + staffEnt.getName() + "%";
        List<Staff> list = super.commonQueryByName(hql, name);
        return list;
    }

    /**
     * 分页
     *
     * @param hql
     * @param objects
     * @return
     */
    @Override
    public List<Staff> queryPageList(String hql, Object... objects) {
        List<Staff> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(Staff.class)
                .list();
        return list;
    }

    /**
     * 总条数
     *
     * @param hql
     * @param objects
     * @return
     */
    @Override
    public int queryPageCount(String hql, Object... objects) {
        //总页数
        Object obj = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql).uniqueResult();
        return Integer.parseInt(obj.toString());
    }
}
