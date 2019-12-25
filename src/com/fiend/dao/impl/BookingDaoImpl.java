package com.fiend.dao.impl;

import com.fiend.dao.IBookingDao;
import com.fiend.entity.Appointment;
import com.fiend.entity.Company;
import com.fiend.entity.Servicecar;
import com.fiend.entity.Servicesmall;
import com.fiend.util.BaseDao;

import java.util.List;

public class BookingDaoImpl extends BaseDao implements IBookingDao {

    @Override
    public Company queryCom(int comId) {
        return (Company) super.commonGetObj(new Company(),comId);
    }

    @Override
    public List<Servicecar> queryByServiceCarList(String hql) {
        return commonQuery(hql);
    }

    @Override
    public List<Servicesmall> queryByServiceSmallList(String hql) {
        return commonQuery(hql);
    }

    @Override
    public boolean addAppointment(Appointment appointmentEnt) {
        return super.commonSaveOrUpdate(appointmentEnt);
    }

}
