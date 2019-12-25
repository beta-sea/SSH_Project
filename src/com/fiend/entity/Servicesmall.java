package com.fiend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Servicesmall {
    private int serviceSmallId;
    private String name;
    private double price;
    private String serviceIntroduce;
    private String serviceType;

    @Id
    @Column(name = "serviceSmallId")
    public int getServiceSmallId() {
        return serviceSmallId;
    }

    public void setServiceSmallId(int serviceSmallId) {
        this.serviceSmallId = serviceSmallId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "serviceIntroduce")
    public String getServiceIntroduce() {
        return serviceIntroduce;
    }

    public void setServiceIntroduce(String serviceIntroduce) {
        this.serviceIntroduce = serviceIntroduce;
    }

    @Basic
    @Column(name = "serviceType")
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servicesmall that = (Servicesmall) o;
        return serviceSmallId == that.serviceSmallId &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(name, that.name) &&
                Objects.equals(serviceIntroduce, that.serviceIntroduce) &&
                Objects.equals(serviceType, that.serviceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceSmallId, name, price, serviceIntroduce, serviceType);
    }
}
