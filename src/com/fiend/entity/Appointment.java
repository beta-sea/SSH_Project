package com.fiend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Appointment {
    private int userId;
    private String customerName;
    private String sex;
    private String carNumber;
    private int vehicleId;
    private String tel;
    private String appointmentTime;
    private int serviceSmallId;

    @Id
    @Column(name = "userId")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "customerName")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "carNumber")
    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Basic
    @Column(name = "vehicleId")
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Basic
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "appointmentTime")
    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    @Basic
    @Column(name = "serviceSmallId")
    public int getServiceSmallId() {
        return serviceSmallId;
    }

    public void setServiceSmallId(int serviceSmallId) {
        this.serviceSmallId = serviceSmallId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return userId == that.userId &&
                vehicleId == that.vehicleId &&
                serviceSmallId == that.serviceSmallId &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(carNumber, that.carNumber) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(appointmentTime, that.appointmentTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, customerName, sex, carNumber, vehicleId, tel, appointmentTime, serviceSmallId);
    }
}
