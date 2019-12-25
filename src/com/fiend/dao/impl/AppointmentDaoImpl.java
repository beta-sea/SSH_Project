package com.fiend.dao.impl;

import com.fiend.dao.IAppointmentDao;
import com.fiend.entity.Appointment;
import com.fiend.util.BaseDao;

import java.util.List;

public class AppointmentDaoImpl extends BaseDao implements IAppointmentDao {
    @Override
    public boolean addAppointment(Appointment appointmentEnt) {
        return super.commonSaveOrUpdate(appointmentEnt);
    }

    @Override
    public boolean updateAppointment(Appointment appointmentEnt) {
        super.update(appointmentEnt);
        return true;
    }

    @Override
    public boolean deleteAppointment(int appointmentId) {
        Appointment appointmentEnt = (Appointment)super.commonGetObj(new Appointment(),appointmentId);
        boolean bool = super.commonDelete(appointmentEnt);
        return bool;
    }

    @Override
    public Appointment queryById(Appointment appointmentEnt, int id) {
        Appointment appointment = (Appointment)super.commonGetObj(appointmentEnt,id);
        return appointment;
    }


    @Override
    public List<Appointment> queryPageList(String hql, Object... objects) {
        List<Appointment> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(Appointment.class)
                .list();
        return list;
    }

    @Override
    public int queryPageCount(String hql, Object... objects) {
        Object obj = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql).uniqueResult();
        return Integer.parseInt(obj.toString());
    }

    @Override
    public List<Appointment> queryByPerList(String hql) {
        List<Appointment> list = super.commonQuery(hql);
        return list;
    }

    @Override
    public List<Appointment> queryByName(String hql) {
        List<Appointment> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(Appointment.class)
                .list();
        return list;
    }
}
