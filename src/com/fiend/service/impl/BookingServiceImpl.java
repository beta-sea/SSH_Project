package com.fiend.service.impl;

import com.fiend.dao.IBookingDao;
import com.fiend.entity.Appointment;
import com.fiend.entity.Company;
import com.fiend.entity.Servicecar;
import com.fiend.entity.Servicesmall;
import com.fiend.service.IBookingService;

import java.util.List;

public class BookingServiceImpl implements IBookingService {

    private IBookingDao bookingDao;

    public IBookingDao getBookingDao() {
        return bookingDao;
    }

    public void setBookingDao(IBookingDao bookingDao) {
        this.bookingDao = bookingDao;
    }


    @Override
    public Company queryCom(int comId) {
        return bookingDao.queryCom(comId);
    }

    @Override
    public List<Servicecar> queryByServiceCarList() {
        String hql = "from Servicecar";
        List<Servicecar> list = bookingDao.queryByServiceCarList(hql);
        return list;
    }

    @Override
    public List<Servicesmall> queryByServiceSmallList() {
        String hql = "from Servicesmall";
        List<Servicesmall> list = bookingDao.queryByServiceSmallList(hql);
        return list;
    }

    @Override
    public boolean addAppointment(Appointment appointmentEnt) {
        return bookingDao.addAppointment(appointmentEnt);
    }
}
