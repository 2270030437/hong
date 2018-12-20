package com.example.hong.pojo;

import java.io.Serializable;

public class juan implements Serializable {
    private Integer wid;
    private String wname;
    private String tem;
    private String money;

    public juan() {
    }

    public juan(Integer wid, String wname, String tem, String money) {
        this.wid = wid;
        this.wname = wname;
        this.tem = tem;
        this.money = money;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
