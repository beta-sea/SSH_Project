package com.fiend.service;

import com.fiend.entity.Appointment;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public interface IAppointmentService {
    boolean addAppointment(Appointment appointmentEnt);

    boolean updateAppointment(Appointment appointmentEnt);

    List<Appointment> queryAppointmentList();

    Appointment queryById(int appointmentId);

    boolean deleteAppointment(int appointmentId);

    PageModel<Appointment> queryPageList(Map<String, Object> map);

    PageModel<Appointment> queryByName(Appointment appointmentEnt, Map<String, Object> map);


    
    
}
