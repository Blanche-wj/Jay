package com.wuwenjie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_roomtype")
public class T_roomtype {
    @Id
    @Column
    private Integer typeid;
    @Column
    private String typename;

    public T_roomtype() {
    }

    public T_roomtype(Integer typeid, String typename) {
        this.typeid = typeid;
        this.typename = typename;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    public String toString() {
        return "T_roomtype{" +
                "typeid=" + typeid +
                ", typename='" + typename + '\'' +
                '}';
    }
}
