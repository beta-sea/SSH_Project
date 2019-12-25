package com.fiend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Company {
    private int id;
    private String companyName;
    private String companyAddress;
    private String phone;
    private String tel;
    private String qq;
    private String contacts;
    private String mail;
    private String zipCode;
    private String companySynopsis;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "companyName")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "companyAddress")
    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
    @Column(name = "QQ")
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "contacts")
    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    @Basic
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "zipCode")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Basic
    @Column(name = "companySynopsis")
    public String getCompanySynopsis() {
        return companySynopsis;
    }

    public void setCompanySynopsis(String companySynopsis) {
        this.companySynopsis = companySynopsis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id &&
                Objects.equals(companyName, company.companyName) &&
                Objects.equals(companyAddress, company.companyAddress) &&
                Objects.equals(phone, company.phone) &&
                Objects.equals(tel, company.tel) &&
                Objects.equals(qq, company.qq) &&
                Objects.equals(contacts, company.contacts) &&
                Objects.equals(mail, company.mail) &&
                Objects.equals(zipCode, company.zipCode) &&
                Objects.equals(companySynopsis, company.companySynopsis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, companyName, companyAddress, phone, tel, qq, contacts, mail, zipCode, companySynopsis);
    }
}
