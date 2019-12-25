package com.fiend.action;

import com.fiend.entity.Repair;
import com.fiend.service.IRepairService;
import com.fiend.util.PageModel;
import com.opensymphony.xwork2.ActionContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepairAction {
    private Repair repairEnt;
    private IRepairService repairService;
    private int pageNo;
    private int pageSize;

    public String queryRepairList(){
        List<Repair> list = repairService.queryRepairList();
        ActionContext.getContext().put("list",list);
        return "queryRepairList";
    }

    public String queryById(){
        Repair retRepairEnt = repairService.queryById(repairEnt.getId());
        ActionContext.getContext().put("retRepairEnt",retRepairEnt);
        return "queryById";
    }

    public String updateSavePerEnt(){
        Repair repair = repairService.queryById(repairEnt.getId());
        repair.setCost(repairEnt.getCost());
        repair.setCustomerId(repairEnt.getCustomerId());
        repair.setDeliveryTime(repairEnt.getDeliveryTime());
        repair.setLengthService(repairEnt.getLengthService());
        repair.setServiceSmallId(repairEnt.getServiceSmallId());
        repair.setServiceTime(repairEnt.getServiceTime());
        repair.setStaffId(repairEnt.getStaffId());

        boolean bool = repairService.updateRepair(repair);

        if (bool){
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "caseDateSuccess";
        }else {
            return "caseDateError";
        }
    }

    public String deleteRepairEnt(){

        boolean bool = repairService.deleteRepair(repairEnt.getId());

        if (bool){
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "caseDateSuccess";
        }else {
            return "caseDateError";
        }
    }

    public String addRepairEnt(){
        boolean bool = repairService.addRepair(repairEnt);
        if(bool){
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "addRepairEnt";
        }else {
            return "errorInfo";
        }

    }

    public String turnToPageAdd(){
        return "turnToPageAdd";
    }

    public String queryByName(){
        Map<String,Object> map = new HashMap<>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);
        //调用service中分页方法
        PageModel<Repair> pg = repairService.queryByName(repairEnt,map);
        //存入当前页数
        pg.setPageNo(pageNo);
        //存入作用域
        ActionContext.getContext().put("pg",pg);
        return "queryByName";

    }

    public String queryPageList(){
        Map<String,Object> map = new HashMap<>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);
        //调用service中分页方法
        PageModel<Repair> pg = repairService.queryPageList(map);
        //存入当前页数
        pg.setPageNo(pageNo);
        //存入作用域
        ActionContext.getContext().put("pg",pg);

        return "queryPageList";
    }














    public Repair getRepairEnt() {
        return repairEnt;
    }

    public void setRepairEnt(Repair repairEnt) {
        this.repairEnt = repairEnt;
    }

    public IRepairService getRepairService() {
        return repairService;
    }

    public void setRepairService(IRepairService repairService) {
        this.repairService = repairService;
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
