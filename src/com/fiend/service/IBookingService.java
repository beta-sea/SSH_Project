package com.fiend.service;

import com.fiend.entity.Appointment;
import com.fiend.entity.Company;
import com.fiend.entity.Servicecar;
import com.fiend.entity.Servicesmall;

import java.util.List;

public interface IBookingService {

    Company queryCom(int comId);

    List<Servicecar> queryByServiceCarList();

    List<Servicesmall> queryByServiceSmallList();

    boolean addAppointment(Appointment appointmentEnt);

}
