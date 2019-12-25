package com.fiend.action;

import com.fiend.entity.Appointment;
import com.fiend.service.IAppointmentService;
import com.fiend.util.PageModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppointmentAction extends ActionSupport {
    private Appointment appointmentEnt;

    private IAppointmentService appointmentService;

    private int pageNo;

    private int pageSize;

    public String queryAppointmentList() {
        List<Appointment> list = appointmentService.queryAppointmentList();

        ActionContext.getContext().put("list", list);

        return "queryAppointmentList";

    }

    public String queryById() {
        Appointment retAppointmentEnt = appointmentService.queryById(appointmentEnt.getUserId());
        ActionContext.getContext().put("retAppointmentEnt", retAppointmentEnt);
        return "queryById";
    }

    public String updateSavePerEnt() {
        Appointment appointment = appointmentService.queryById(appointmentEnt.getUserId());
        appointment.setAppointmentTime(appointmentEnt.getAppointmentTime());
        appointment.setCarNumber(appointmentEnt.getCarNumber());
        appointment.setCustomerName(appointmentEnt.getCustomerName());
        appointment.setServiceSmallId(appointmentEnt.getServiceSmallId());
        appointment.setSex(appointmentEnt.getSex());
        appointment.setTel(appointmentEnt.getTel());
        appointment.setVehicleId(appointmentEnt.getVehicleId());

        boolean bool = appointmentService.updateAppointment(appointment);

        if (bool) {
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "caseDateSuccess";
        } else {
            return "caseDateError";
        }

    }

    public String deleteAppointmentEnt() {
        boolean bool = appointmentService.deleteAppointment(appointmentEnt.getUserId());

        if (bool) {
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "caseDateSuccess";
        } else {
            return "caseDateError";
        }
    }

    public String addAppointmentEnt() {
        boolean bool = appointmentService.addAppointment(appointmentEnt);
        if (bool) {
            return "addAppointmentEnt";
        } else {
            return "errorInfo";
        }

    }

    public String turnToPageAdd() {
        return "turnToPageAdd";
    }


    public String queryByName() {
        Map<String, Object> map = new HashMap<>();
        map.put("pageNo", pageNo);
        map.put("pageSize", pageSize);
        PageModel<Appointment> pg = appointmentService.queryByName(appointmentEnt, map);
        pg.setPageNo(pageNo);
        ActionContext.getContext().put("pg", pg);
        return "queryByName";

    }

    public String queryPageList() {
        Map<String, Object> map = new HashMap<>();
        map.put("pageNo", pageNo);
        map.put("pageSize", pageSize);
        //调用service中分页方法
        PageModel<Appointment> pg = appointmentService.queryPageList(map);
        //存入当前页数
        pg.setPageNo(pageNo);
        //存入作用域
        ActionContext.getContext().put("pg", pg);

        return "queryPageList";

    }


    public Appointment getAppointmentEnt() {
        return appointmentEnt;
    }

    public void setAppointmentEnt(Appointment appointmentEnt) {
        this.appointmentEnt = appointmentEnt;
    }

    public IAppointmentService getAppointmentService() {
        return appointmentService;
    }

    public void setAppointmentService(IAppointmentService appointmentService) {
        this.appointmentService = appointmentService;
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
