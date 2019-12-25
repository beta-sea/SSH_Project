package com.fiend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Leaving {
    private int id;
    private String messageUser;
    private String tel;
    private String message;
    private String messageDate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "messageUser")
    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
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
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "messageDate")
    public String getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(String messageDate) {
        this.messageDate = messageDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leaving leaving = (Leaving) o;
        return id == leaving.id &&
                Objects.equals(messageUser, leaving.messageUser) &&
                Objects.equals(tel, leaving.tel) &&
                Objects.equals(message, leaving.message) &&
                Objects.equals(messageDate, leaving.messageDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, messageUser, tel, message, messageDate);
    }
}
