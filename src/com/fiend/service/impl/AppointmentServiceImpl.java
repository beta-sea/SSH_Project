package com.fiend.service.impl;

import com.fiend.dao.IAppointmentDao;
import com.fiend.entity.Appointment;
import com.fiend.service.IAppointmentService;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public class AppointmentServiceImpl implements IAppointmentService {
    private IAppointmentDao appointmentDao;

    @Override
    public boolean addAppointment(Appointment appointmentEnt) {
        return appointmentDao.addAppointment(appointmentEnt);
    }

    @Override
    public boolean updateAppointment(Appointment appointmentEnt) {
        return appointmentDao.updateAppointment(appointmentEnt);
    }

    @Override
    public List<Appointment> queryAppointmentList() {
        String hql = "from appointment";
        List<Appointment> list = appointmentDao.queryByPerList(hql);
        return list;
    }

    @Override
    public Appointment queryById(int appointmentId) {
        Appointment appointmentEnt = appointmentDao.queryById(new Appointment(),appointmentId);
        return appointmentEnt;
    }

    @Override
    public boolean deleteAppointment(int appointmentId) {
        return appointmentDao.deleteAppointment(appointmentId);
    }



    @Override
    public PageModel<Appointment> queryPageList(Map<String, Object> map) {
        PageModel<Appointment> pg = new PageModel<>();

        int pageNo = (int)map.get("pageNo");
        int pageSize = (int)map.get("pageSize");

        int beginNum = (pageNo - 1)*pageSize;

        StringBuffer hql = new StringBuffer("select * from appointment where 1=1 limit " + beginNum + "," + pageSize);
        StringBuffer hqlCount = new StringBuffer("select count(userId) as counNum from appointment");

        List<Appointment> pageList = appointmentDao.queryPageList(hql.toString());
        int totalNum = appointmentDao.queryPageCount(hqlCount.toString());


        //存入返回对象 pg
        pg.setList(pageList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);
        return pg;
    }

    @Override
    public PageModel<Appointment> queryByName(Appointment appointmentEnt, Map<String, Object> map) {
        PageModel<Appointment> pg = new PageModel<>();
        int pageNo = (int) map.get("pageNo");
        int pageSize = (int) map.get("pageSize");
        int beginNum = (pageNo - 1) * pageSize;
        String name = "'%"+appointmentEnt.getCustomerName()+"%'";
        StringBuffer hql = new StringBuffer("select * from appointment where customerName like "+ name + " limit "+ beginNum +","+pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(userId) as countNum from appointment where customerName like "+name);
        List<Appointment> appointmentList = appointmentDao.queryByName(hql.toString());
        int totalNum = appointmentDao.queryPageCount(hqlCount.toString());
        pg.setList(appointmentList);
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);
        return pg;
    }


    public IAppointmentDao getAppointmentDao() {
        return appointmentDao;
    }

    public void setAppointmentDao(IAppointmentDao appointmentDao) {
        this.appointmentDao = appointmentDao;
    }
}
