package com.fiend.action;

import com.fiend.entity.Servicesmall;
import com.fiend.service.IServiceSmallService;
import com.fiend.util.PageModel;
import com.opensymphony.xwork2.ActionContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceSmallAction {
    private Servicesmall serviceSmallEnt;

    private IServiceSmallService serviceSmallService;
    private int pageNo;
    private int pageSize;

    public String queryServiceSmallList(){
        List<Servicesmall> list = serviceSmallService.queryServiceSmallList();

        ActionContext.getContext().put("list",list);

        return "queryServiceSmallList";
    }

    public String queryById(){
        Servicesmall retServiceSmallEnt = serviceSmallService.queryById(serviceSmallEnt.getServiceSmallId());
        ActionContext.getContext().put("retServiceSmallEnt",retServiceSmallEnt);
        return  "queryById";
    }


    public String updateSavePerEnt(){
        Servicesmall serviceSmall = serviceSmallService.queryById(serviceSmallEnt.getServiceSmallId());
        serviceSmall.setName(serviceSmallEnt.getName());
        serviceSmall.setPrice(serviceSmallEnt.getPrice());
        serviceSmall.setServiceIntroduce(serviceSmallEnt.getServiceIntroduce());
        serviceSmall.setServiceType(serviceSmallEnt.getServiceType());
        boolean bool = serviceSmallService.updateServiceSmall(serviceSmall);

        if(bool){
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "caseDateSuccess";
        }else{
            return "caseDateError";
        }

    }

    public String deleteServiceSmallEnt(){

        boolean bool = serviceSmallService.deleteServiceSmall(serviceSmallEnt.getServiceSmallId());

        if(bool){
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "caseDateSuccess";
        }else{
            return "caseDateError";
        }

    }

    public String addServiceSmallEnt(){
        boolean bool = serviceSmallService.addServiceSmall(serviceSmallEnt);
        if (bool){
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "addServiceSmallEnt";
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
        PageModel<Servicesmall> pg = serviceSmallService.queryByName(serviceSmallEnt,map);
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
        PageModel<Servicesmall> pg = serviceSmallService.queryPageList(map);
        //存入当前页数
        pg.setPageNo(pageNo);
        //存入作用域
        ActionContext.getContext().put("pg",pg);

        return "queryPageList";
    }










    public Servicesmall getServiceSmallEnt() {
        return serviceSmallEnt;
    }

    public void setServiceSmallEnt(Servicesmall serviceSmallEnt) {
        this.serviceSmallEnt = serviceSmallEnt;
    }

    public IServiceSmallService getServiceSmallService() {
        return serviceSmallService;
    }

    public void setServiceSmallService(IServiceSmallService serviceSmallService) {
        this.serviceSmallService = serviceSmallService;
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
