package com.fiend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Instock {
    private int id;
    private String inventor;
    private String inTime;
    private int fittingId;
    private int inNumber;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Inventor")
    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }

    @Basic
    @Column(name = "inTime")
    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    @Basic
    @Column(name = "fittingId")
    public int getFittingId() {
        return fittingId;
    }

    public void setFittingId(int fittingId) {
        this.fittingId = fittingId;
    }

    @Basic
    @Column(name = "inNumber")
    public int getInNumber() {
        return inNumber;
    }

    public void setInNumber(int inNumber) {
        this.inNumber = inNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instock instock = (Instock) o;
        return id == instock.id &&
                fittingId == instock.fittingId &&
                inNumber == instock.inNumber &&
                Objects.equals(inventor, instock.inventor) &&
                Objects.equals(inTime, instock.inTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, inventor, inTime, fittingId, inNumber);
    }
}
