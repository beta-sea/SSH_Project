package com.fiend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Outstock {
    private int id;
    private String consignee;
    private String outTime;
    private String outReason;
    private int fittingId;
    private int outNumber;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "consignee")
    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    @Basic
    @Column(name = "outTime")
    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    @Basic
    @Column(name = "outReason")
    public String getOutReason() {
        return outReason;
    }

    public void setOutReason(String outReason) {
        this.outReason = outReason;
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
    @Column(name = "outNumber")
    public int getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(int outNumber) {
        this.outNumber = outNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Outstock outstock = (Outstock) o;
        return id == outstock.id &&
                fittingId == outstock.fittingId &&
                outNumber == outstock.outNumber &&
                Objects.equals(consignee, outstock.consignee) &&
                Objects.equals(outTime, outstock.outTime) &&
                Objects.equals(outReason, outstock.outReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, consignee, outTime, outReason, fittingId, outNumber);
    }
}
