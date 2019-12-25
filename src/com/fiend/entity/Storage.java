package com.fiend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Storage {
    private int storageId;
    private String name;
    private String introduce;

    @Id
    @Column(name = "storageId")
    public int getStorageId() {
        return storageId;
    }

    public void setStorageId(int storageId) {
        this.storageId = storageId;
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
    @Column(name = "introduce")
    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage storage = (Storage) o;
        return storageId == storage.storageId &&
                Objects.equals(name, storage.name) &&
                Objects.equals(introduce, storage.introduce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageId, name, introduce);
    }
}
