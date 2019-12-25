package com.fiend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Stock {
    private int fittingId;
    private String fittingName;
    private String brand;
    private double purchasePrice;
    private String img;
    private String vehicleType;
    private String vehicleNumber;
    private double price;
    private String functions;
    private int number;

    @Id
    @Column(name = "fittingId")
    public int getFittingId() {
        return fittingId;
    }

    public void setFittingId(int fittingId) {
        this.fittingId = fittingId;
    }

    @Basic
    @Column(name = "fittingName")
    public String getFittingName() {
        return fittingName;
    }

    public void setFittingName(String fittingName) {
        this.fittingName = fittingName;
    }

    @Basic
    @Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "purchasePrice")
    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Basic
    @Column(name = "img")
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Basic
    @Column(name = "vehicleType")
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Basic
    @Column(name = "vehicleNumber")
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
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
    @Column(name = "functions")
    public String getFunctions() {
        return functions;
    }

    public void setFunctions(String functions) {
        this.functions = functions;
    }

    @Basic
    @Column(name = "number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return fittingId == stock.fittingId &&
                Double.compare(stock.purchasePrice, purchasePrice) == 0 &&
                Double.compare(stock.price, price) == 0 &&
                number == stock.number &&
                Objects.equals(fittingName, stock.fittingName) &&
                Objects.equals(brand, stock.brand) &&
                Objects.equals(img, stock.img) &&
                Objects.equals(vehicleType, stock.vehicleType) &&
                Objects.equals(vehicleNumber, stock.vehicleNumber) &&
                Objects.equals(functions, stock.functions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fittingId, fittingName, brand, purchasePrice, img, vehicleType, vehicleNumber, price, functions, number);
    }
}
