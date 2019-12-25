package com.fiend.service.impl;

import com.fiend.dao.IStaffDao;
import com.fiend.entity.Admin;
import com.fiend.entity.Staff;
import com.fiend.service.IStaffService;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public class StaffServiceImpl implements IStaffService {

    //调用Dao层接口参数 生成get;set方法
    private IStaffDao staffDao;

    public IStaffDao getStaffDao() {
        return staffDao;
    }

    public void setStaffDao(IStaffDao staffDao) {
        this.staffDao = staffDao;
    }


    @Override
    public boolean addStaff(Staff staffEnt) {
        boolean bool = staffDao.addStaff(staffEnt);

        return bool;
    }

    @Override
    public boolean updateStaff(Staff staffEnt) {
        boolean bool = staffDao.updateStaff(staffEnt);
        return bool;
    }

    @Override
    public Admin queryAd(String loginName, String loginPwd) {
        //查询语句拼写
        String hql = "from Admin where loginName = ? and loginPwd = ?";
        List<Admin> list = staffDao.queryByName(hql, loginName, loginPwd);

        //判断是否为null 返回数据
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<Staff> queryStaffList() {
        //查询语句拼写
        String hql = "from Staff";
        List<Staff> list = staffDao.queryByPerList(hql);
        return list;
    }

    @Override
    public List<Staff> queryByNameAndSex(Staff staffEnt) {
        //定义查询hql语句
        String hql = "from Staff where name like ?";
        //调用查询方法
        List<Staff> list = staffDao.queryByNameAndSex(hql, staffEnt);
        return list;
    }

    @Override
    public Staff queryById(int staffId) {
        Staff staffEnt = staffDao.queryById(new Staff(), staffId);
        return staffEnt;
    }

    @Override
    public boolean deletePerson(int staffId) {
        boolean bool = staffDao.deleteStaff(staffId);
        return bool;
    }

    /**
     * 分页方法业务实现
     *
     * @param map
     * @return
     */
    @Override
    public PageModel<Staff> queryPageList(Map<String, Object> map) {

        //定义返回对象
        PageModel<Staff> pg = new PageModel<>();
        //调用列表+总条数 方法查询 将结果放到 pg
        int pageNo = (int) map.get("pageNo");
        int pageSize = (int) map.get("pageSize");
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        StringBuffer hql = new StringBuffer("select * from Staff where 1=1 limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(staffId) as counNum from Staff");

        //查询
        List<Staff> pageList = staffDao.queryPageList(hql.toString());
        int totalNum = staffDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(pageList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);

        return pg;
    }


}
