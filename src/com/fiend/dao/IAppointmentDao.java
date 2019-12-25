package com.fiend.dao;

import com.fiend.entity.Appointment;

import java.util.List;

public interface IAppointmentDao {
    
    
    boolean addAppointment(Appointment appointmentEnt);

    boolean updateAppointment(Appointment appointmentEnt);

    boolean deleteAppointment(int appointmentId);

    Appointment queryById(Appointment appointmentEnt, int id);

    List<Appointment> queryByPerList(String hql);

    List<Appointment> queryByName(String hql);

    List<Appointment> queryPageList(String hql, Object... objects);

    /**
     * 返回数据总条数
     *
     * @return
     */
    int queryPageCount(String hql, Object... objects);

}
