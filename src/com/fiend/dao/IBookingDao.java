package com.fiend.dao;

import com.fiend.entity.Appointment;
import com.fiend.entity.Company;
import com.fiend.entity.Servicecar;
import com.fiend.entity.Servicesmall;

import java.util.List;

public interface IBookingDao {

    Company queryCom(int comId);

    List<Servicecar> queryByServiceCarList(String hql);

    List<Servicesmall> queryByServiceSmallList(String hql);

    boolean addAppointment(Appointment appointmentEnt);
}
