package com.fiend.action_font;

import com.fiend.entity.Appointment;
import com.fiend.entity.Company;
import com.fiend.service.IBookingService;
import com.opensymphony.xwork2.ActionContext;

import java.util.List;

public class BookingAction {

    private IBookingService bookingService;
    private Appointment appointmentEnt;


    public String showInfoToBooking() {

        Company company = bookingService.queryCom(1);
        ActionContext.getContext().put("company",company);

        List carList = bookingService.queryByServiceCarList();
        ActionContext.getContext().put("carList",carList);
        List smallList = bookingService.queryByServiceSmallList();
        ActionContext.getContext().put("smallList",smallList);

        return "showInfoToBooking";
    }

    public String addAppointmentEnt() {
        boolean bool = bookingService.addAppointment(appointmentEnt);
        if (bool) {
            this.showInfoToBooking();
            return "caseDateSuccess";
        } else {
            return "errorInfo";
        }

    }




    public IBookingService getBookingService() {
        return bookingService;
    }

    public void setBookingService(IBookingService bookingService) {
        this.bookingService = bookingService;
    }

    public Appointment getAppointmentEnt() {
        return appointmentEnt;
    }

    public void setAppointmentEnt(Appointment appointmentEnt) {
        this.appointmentEnt = appointmentEnt;
    }
}
