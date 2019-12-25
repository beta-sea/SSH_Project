package com.fiend.action;

import com.fiend.entity.Recruit;
import com.fiend.service.IRecruitService;
import com.fiend.util.PageModel;
import com.opensymphony.xwork2.ActionContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecruitAction {
    //创建参数
    private Recruit recruitEnt;

    //创建service层对象
    private IRecruitService recruitService;

    private int pageNo; //当前页数
    private int pageSize; //每页显示条数

    /**
     * 添加方法
     *
     */
    public String saveRecruitEnt(){return "addRecruitEnt";}

    /**
     * 保存方法
     */
    public String addRecruitEnt(){

        boolean bool = recruitService.addRecruit(recruitEnt);
        if(bool){
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "addRecruitEnt";
        }else {
            return "errorInfo";
        }
    }

    /**
     * 查询用户列表
     */
    public String queryPersonList(){
        //调用Service
        List<Recruit> list = recruitService.queryRecruitList();

        //存入请求作用域request
        ActionContext.getContext().put("list",list);

        return "queryPersonList";
    }

    /**
     * 查询
     */
    public String queryByNameAndSex(){
        Map<String,Object> map = new HashMap<>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);
        //调用业务层查询方法
        PageModel<Recruit> pg  = recruitService.queryByNameAndSex(recruitEnt,map);
        //存入当前页数
        pg.setPageNo(pageNo);
        //存入作用域
        ActionContext.getContext().put("pg",pg);
        return "queryByNameAndSex";
    }

    /**
     * 修改查询方法
     */
    public String queryById(){
        Recruit retPerEnt = recruitService.queryById(recruitEnt.getId());
        ActionContext.getContext().put("retPerEnt",retPerEnt);
        return "queryById";
    }

    /**
     * 修改保持数据
     * @return
     */
    public String upDateSavePerEnt(){
        Recruit per = recruitService.queryById(recruitEnt.getId());
        per.setName(recruitEnt.getName());
        per.setSex(recruitEnt.getSex());
        per.setIdCard(recruitEnt.getIdCard());
        per.setJob(recruitEnt.getJob());

        boolean bool = recruitService.updateRecruit(per);

        if (bool){
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
     */
    public String deleteRecruitEnt(){
        boolean bool = recruitService.deletePerson(recruitEnt.getId());

        if(bool){
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "caseDateSuccess";
        } else {
            return "caseDateError";
        }
    }

    /**
     * 分页
     */
    public String queryPageList(){
        Map<String,Object> map = new HashMap<>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);
        //调用service 中的分页方法
        PageModel<Recruit> pg = recruitService.queryPageList(map);
        //存入当前页数
        pg.setPageNo(pageNo);
        //存入作用域
        ActionContext.getContext().put("pg",pg);
        return "queryPageList";
    }

    public Recruit getRecruitEnt() { return recruitEnt; }

    public void setRecruitEnt(Recruit recruitEnt) { this.recruitEnt = recruitEnt; }

    public IRecruitService getRecruitEntityService() {return recruitService; }

    public void setRecruitService(IRecruitService getRecruitEntityService) { this.recruitService = getRecruitEntityService; }

    public int getPageNo() { return pageNo; }

    public void setPageNo(int pageNo) { this.pageNo = pageNo; }

    public int getPageSize() { return pageSize; }

    public void setPageSize(int pageSize) { this.pageSize = pageSize; }
}
