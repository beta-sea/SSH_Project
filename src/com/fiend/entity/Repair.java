package com.fiend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Repair {
    private int id;
    private int customerId;
    private String serviceTime;
    private String lengthService;
    private int staffId;
    private double cost;
    private String deliveryTime;
    private int serviceSmallId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "customerId")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "serviceTime")
    public String getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime;
    }

    @Basic
    @Column(name = "lengthService")
    public String getLengthService() {
        return lengthService;
    }

    public void setLengthService(String lengthService) {
        this.lengthService = lengthService;
    }

    @Basic
    @Column(name = "staffId")
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "cost")
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "deliveryTime")
    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
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
        Repair repair = (Repair) o;
        return id == repair.id &&
                customerId == repair.customerId &&
                staffId == repair.staffId &&
                Double.compare(repair.cost, cost) == 0 &&
                serviceSmallId == repair.serviceSmallId &&
                Objects.equals(serviceTime, repair.serviceTime) &&
                Objects.equals(lengthService, repair.lengthService) &&
                Objects.equals(deliveryTime, repair.deliveryTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerId, serviceTime, lengthService, staffId, cost, deliveryTime, serviceSmallId);
    }
}
