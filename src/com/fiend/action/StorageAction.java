package com.fiend.action;

import com.fiend.entity.Storage;
import com.fiend.service.IStorageService;
import com.fiend.util.PageModel;
import com.opensymphony.xwork2.ActionContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StorageAction {

    //创建参数
    private Storage storageEnt;

    //创建service层对象
    private IStorageService storageService;

    private Map<String, Object> map = new HashMap<>();


    /**
     * 查询用户列表
     * @return
     */
    public String queryStorageList(){
        //调用Service
        List<Storage> list = storageService.queryByStoList();

        //存入请求作用域request
        ActionContext.getContext().put("list",list);

        return "queryStorageList";
    }

    /**
     * 修改查询方法
     * @return
     */
    public String queryById(){
        Storage retstorageEnt = storageService.queryById( storageEnt.getStorageId());
        ActionContext.getContext().put("retstorageEnt",retstorageEnt);
        return "queryById";
    }

    /**
     * 修改保持数据
     * @return
     */
    public String upDateSavePerEnt(){
        boolean bool = storageService.updateSto(storageEnt);

        if (bool){
            map.put("pageNo",1);
            map.put("pageSize",10);
            this.queryPageList();
            return "caseDateSuccess";
        } else {
            return "caseDateError";
        }

    }

    /**
     * 删除
     * @return
     */
    public String deletestorageEnt(){

        boolean bool = storageService.deleteSto(storageEnt.getStorageId());

        if (bool){
            map.put("pageNo",1);
            map.put("pageSize",10);
            this.queryPageList();
            return "caseDateSuccess";
        } else {
            return "caseDateError";
        }
    }

    /**
     * 分页
     * @return
     */
    public String queryPageList(){
        //调用service中分页方法
        PageModel<Storage> pg = storageService.queryPageList(map);
        //存入作用域
        ActionContext.getContext().put("pg",pg);

        return "queryPageList";
    }

    public Storage getstorageEnt() {
        return storageEnt;
    }

    public void setstorageEnt(Storage storageEnt) {
        storageEnt = storageEnt;
    }

    public IStorageService getStorageService() {
        return storageService;
    }

    public void setStorageService(IStorageService storageService) {
        this.storageService = storageService;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
