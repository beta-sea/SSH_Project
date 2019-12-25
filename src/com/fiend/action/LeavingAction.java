package com.fiend.action;

import com.fiend.entity.Leaving;
import com.fiend.service.ILeavingService;
import com.fiend.util.PageModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.HashMap;
import java.util.Map;

public class LeavingAction extends ActionSupport {

    private Leaving leavingEnt;
    private Map<String, Object> map = new HashMap<>();
    private ILeavingService leavingService;


    /**
     * 分页
     *
     * @return
     */
    public String queryPageLeavingList() {
        //调用service中分页方法
        PageModel<Leaving> pg = leavingService.queryPageList(map);
        //存入作用域
        ActionContext.getContext().put("pg", pg);

        return "queryPageLeavingList";
    }

    /**
     * 删除
     *
     * @return
     */
    public String deleteLeavingEnt() {

        boolean bool = leavingService.deleteLeaving(leavingEnt.getId());

        if (bool) {
            map.put("pageNo",1);
            map.put("pageSize",10);
            this.queryPageLeavingList();
            return "caseDateSuccess";
        } else {
            return "caseDateError";
        }
    }


    public Leaving getLeavingEnt() {
        return leavingEnt;
    }

    public void setLeavingEnt(Leaving leavingEnt) {
        this.leavingEnt = leavingEnt;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public ILeavingService getLeavingService() {
        return leavingService;
    }

    public void setLeavingService(ILeavingService leavingService) {
        this.leavingService = leavingService;
    }
}
