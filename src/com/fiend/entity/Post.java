package com.fiend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Post {
    private int id;
    private String jobName;
    private String jobClaim;
    private Integer number;
    private int storageId;
    private String startTime;
    private String deadline;
    private String duties;
    private String workAddress;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "jobName")
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Basic
    @Column(name = "jobClaim")
    public String getJobClaim() {
        return jobClaim;
    }

    public void setJobClaim(String jobClaim) {
        this.jobClaim = jobClaim;
    }

    @Basic
    @Column(name = "number")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Basic
    @Column(name = "storageId")
    public int getStorageId() {
        return storageId;
    }

    public void setStorageId(int storageId) {
        this.storageId = storageId;
    }

    @Basic
    @Column(name = "startTime")
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "deadline")
    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Basic
    @Column(name = "duties")
    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    @Basic
    @Column(name = "workAddress")
    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id == post.id &&
                storageId == post.storageId &&
                Objects.equals(jobName, post.jobName) &&
                Objects.equals(jobClaim, post.jobClaim) &&
                Objects.equals(number, post.number) &&
                Objects.equals(startTime, post.startTime) &&
                Objects.equals(deadline, post.deadline) &&
                Objects.equals(duties, post.duties) &&
                Objects.equals(workAddress, post.workAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobName, jobClaim, number, storageId, startTime, deadline, duties, workAddress);
    }
}
