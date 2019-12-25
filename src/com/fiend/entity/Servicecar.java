package com.fiend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Servicecar {
    private int vehicleId;
    private String vehicleName;
    private String vehicleImg;

    @Id
    @Column(name = "vehicleId")
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Basic
    @Column(name = "vehicleName")
    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @Basic
    @Column(name = "vehicleImg")
    public String getVehicleImg() {
        return vehicleImg;
    }

    public void setVehicleImg(String vehicleImg) {
        this.vehicleImg = vehicleImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servicecar that = (Servicecar) o;
        return vehicleId == that.vehicleId &&
                Objects.equals(vehicleName, that.vehicleName) &&
                Objects.equals(vehicleImg, that.vehicleImg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleId, vehicleName, vehicleImg);
    }
}
