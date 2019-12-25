package com.fiend.action;

import com.fiend.entity.Admin;
import com.fiend.entity.Staff;
import com.fiend.service.IStaffService;
import com.fiend.util.PageModel;
import com.opensymphony.xwork2.ActionContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StaffAction {

    //创建参数
    private Staff staffEnt;
    private Admin adminEnt;

    //创建service层对象
    private IStaffService staffService;

    private int pageNo;     //当前页数
    private int pageSize;   //每页显示条数

    /**
     * 用户登录方法
     *
     * @return
     */
    public String loginAdmin() {
        //调用方法查询用户是否存在
        Admin adEnt = staffService.queryAd(adminEnt.getLoginName(), adminEnt.getLoginPwd());

        //存入作用域 getSession一次会话作用范围
        ActionContext.getContext().getSession().put("adEnt", adEnt);

        //判断跳转页面
        if (adEnt != null) {
            return "loginSuccess";
        } else {
            return "loginError";
        }
    }

    /**
     * 查询用户列表
     *
     * @return
     */
    public String queryStaffList() {
        //调用Service
        List<Staff> list = staffService.queryStaffList();

        //存入请求作用域request
        ActionContext.getContext().put("list", list);

        return "queryStaffList";
    }

    /**
     * 根据名称和性别进行条件检索
     *
     * @return
     */
    public String queryStaffByNameSex() {

        //调用业务层查询方法
        List<Staff> pList = staffService.queryByNameAndSex(staffEnt);
        //将数据存入作用域
        ActionContext.getContext().put("list", pList);
        ActionContext.getContext().put("perEnt", staffEnt);

        return "queryStaffByNameSex";
    }

    /**
     * 修改查询方法
     *
     * @return
     */
    public String queryById() {
        Staff retStaffEnt = staffService.queryById(staffEnt.getStaffId());
        ActionContext.getContext().put("retStaffEnt", retStaffEnt);
        return "queryById";
    }

    /**
     * 修改保持数据
     *
     * @return
     */
    public String upDateSavePerEnt() {
        Staff staff = staffService.queryById(staffEnt.getStaffId());
        staff.setName(staffEnt.getName());
        staff.setSex(staffEnt.getSex());
        staff.setTel(staffEnt.getTel());
        staff.setIdCard(staffEnt.getIdCard());
        boolean bool = staffService.updateStaff(staff);

        if (bool) {
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "caseDateSuccess";
        } else {
            return "caseDateError";
        }

    }

    /**
     * 删除
     *
     * @return
     */
    public String deleteStaffEnt() {

        boolean bool = staffService.deletePerson(staffEnt.getStaffId());

        if (bool) {
            //调用列表查询方法
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "caseDateSuccess";
        } else {
            return "errorInfo";
        }
    }


    /**
     * 添加页面
     *
     * @return
     */
    public String showSaveStaff() {
        return "showSaveStaff";
    }

    /**
     * 添加
     *
     * @return
     */
    public String addStaffEnt() {


        boolean bool = staffService.addStaff(staffEnt);
        if (bool) {
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "addStaffEnt";
        } else {
            return "errorInfo";
        }

    }

    /**
     * 分页
     *
     * @return
     */
    public String queryPageList() {
        Map<String, Object> map = new HashMap<>();
        map.put("pageNo", pageNo);
        map.put("pageSize", pageSize);
        //调用service中分页方法
        PageModel<Staff> pg = staffService.queryPageList(map);
        //存入当前页数
        pg.setPageNo(pageNo);
        //存入作用域
        ActionContext.getContext().put("pg", pg);

        return "queryPageList";
    }

    public Staff getStaffEnt() {
        return staffEnt;
    }

    public void setStaffEnt(Staff staffEnt) {
        this.staffEnt = staffEnt;
    }

    public Admin getAdminEnt() {
        return adminEnt;
    }

    public void setAdminEnt(Admin adminEnt) {
        this.adminEnt = adminEnt;
    }

    public IStaffService getPersonnelEntityService() {
        return staffService;
    }

    public void setStaffService(IStaffService personnelEntityService) {
        this.staffService = personnelEntityService;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
