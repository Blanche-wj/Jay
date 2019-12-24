package com.wuwenjie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_room")
public class T_room {
    @Id
    @Column
    private Integer roomid;
    @Column
    private String roomno;
    @Column
    private String  roomstatus;
    @Column
    private Integer roomtype;
    @Column
    private String roometel;
    @Column
    private String remark;

    public T_room() {
    }

    public T_room(Integer roomid, String roomno, String roomstatus, Integer roomtype, String roometel, String remark) {
        this.roomid = roomid;
        this.roomno = roomno;
        this.roomstatus = roomstatus;
        this.roomtype = roomtype;
        this.roometel = roometel;
        this.remark = remark;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public String getRoomstatus() {
        return roomstatus;
    }

    public void setRoomstatus(String roomstatus) {
        this.roomstatus = roomstatus;
    }

    public Integer getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(Integer roomtype) {
        this.roomtype = roomtype;
    }

    public String getRoometel() {
        return roometel;
    }

    public void setRoometel(String roometel) {
        this.roometel = roometel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "T_room{" +
                "roomid=" + roomid +
                ", roomno='" + roomno + '\'' +
                ", roomstatus='" + roomstatus + '\'' +
                ", roomtype=" + roomtype +
                ", roometel='" + roometel + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
