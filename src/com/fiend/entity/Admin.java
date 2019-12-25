package com.fiend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Admin {
    private int id;
    private String loginName;
    private String loginPwd;
    private String userName;
    private String job;
    private String tle;
    private String creationTime;
    private String mark;
    private String creationDate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "loginName")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "loginPwd")
    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    @Basic
    @Column(name = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "job")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "tle")
    public String getTle() {
        return tle;
    }

    public void setTle(String tle) {
        this.tle = tle;
    }

    @Basic
    @Column(name = "creationTime")
    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    @Basic
    @Column(name = "mark")
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Basic
    @Column(name = "creationDate")
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return id == admin.id &&
                Objects.equals(loginName, admin.loginName) &&
                Objects.equals(loginPwd, admin.loginPwd) &&
                Objects.equals(userName, admin.userName) &&
                Objects.equals(job, admin.job) &&
                Objects.equals(tle, admin.tle) &&
                Objects.equals(creationTime, admin.creationTime) &&
                Objects.equals(mark, admin.mark) &&
                Objects.equals(creationDate, admin.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, loginName, loginPwd, userName, job, tle, creationTime, mark, creationDate);
    }
}
