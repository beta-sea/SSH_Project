package com.fiend.action;

import com.fiend.entity.Servicecar;
import com.fiend.service.IServiceCarService;
import com.fiend.util.PageModel;
import com.fiend.util.FileUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ClassUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ServiceCarAction extends ActionSupport {
    private Servicecar serviceCarEnt;

    private Map<String, Object> map = new HashMap<>();

    private File upload;

    private String uploadFileName;

    private String uploadContentType;

    private IServiceCarService serviceCarService;

    public String queryPageServiceCarList() {
        //调用service中分页方法
        PageModel<Servicecar> pg = serviceCarService.queryPageList(map);
        //存入作用域
        ActionContext.getContext().put("pg", pg);

        return "queryPageServiceCarList";
    }

    public String deleteServiceCarEnt() {
        boolean bool = serviceCarService.deleteServiceCar(serviceCarEnt.getVehicleId());

        if (bool) {
            map.put("pageNo",1);
            map.put("pageSize",10);
            this.queryPageServiceCarList();
            return "caseDateSuccess";
        } else {
            return "errorInfo";
        }

    }


    public String queryById() {
        Servicecar retServiceCarEnt = serviceCarService.queryById(serviceCarEnt.getVehicleId());
        ActionContext.getContext().put("retServiceCarEnt", retServiceCarEnt);
        return "queryById";
    }

    public String showSaveServiceCar() {
        return "showAddServiceCar";
    }

    public String addServiceCarEnt() throws IOException {
        FileUtil.saveFile(uploadFileName, upload);
        serviceCarEnt.setVehicleImg(uploadFileName);
        boolean bool = serviceCarService.addServiceCar(serviceCarEnt);
        if (bool) {
            map.put("pageNo",1);
            map.put("pageSize",10);
            this.queryPageServiceCarList();
            return "caseDateSuccess";
        } else {
            return "errorInfo";
        }
    }


    public String updateSavePerEnt() throws IOException {
        Servicecar serviceCar = serviceCarService.queryById(serviceCarEnt.getVehicleId());
        String path = ClassUtils.getDefaultClassLoader().getResource("").getPath();
        path = StringUtils.substringBeforeLast(path, "/");
        path = StringUtils.substringBeforeLast(path, "/");
        path = StringUtils.substringBeforeLast(path, "/");
        boolean bool1 = FileUtil.deleteImg(path + "/upFile/" + serviceCar.getVehicleImg());

        FileUtil.saveFile(uploadFileName, upload);
        serviceCar.setVehicleImg(uploadFileName);
        serviceCar.setVehicleName(serviceCarEnt.getVehicleName());
        boolean bool = serviceCarService.updateServiceCar(serviceCar);
        if (bool) {
            map.put("pageNo",1);
            map.put("pageSize",10);
            this.queryPageServiceCarList();
            return "caseDateSuccess";
        } else {
            return "caseDateError";
        }
    }

    public String queryByName() {
        //调用service中分页方法
        PageModel<Servicecar> pg = serviceCarService.queryByName(serviceCarEnt, map);
        //存入当前页数
        String[] arrNO = (String[]) map.get("pageNo");
        pg.setPageNo(Integer.parseInt(arrNO[0]));
        //存入作用域
        ActionContext.getContext().put("pg", pg);

        return "queryByName";

    }

    public Servicecar getServiceCarEnt() {
        return serviceCarEnt;
    }

    public void setServiceCarEnt(Servicecar serviceCarEnt) {
        this.serviceCarEnt = serviceCarEnt;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public IServiceCarService getServiceCarService() {
        return serviceCarService;
    }

    public void setServiceCarService(IServiceCarService serviceCarService) {
        this.serviceCarService = serviceCarService;
    }
}
