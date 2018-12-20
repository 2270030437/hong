package com.example.hong.dao;

public class admin {
   private  String adminName;
    private  Integer adminId;
    private String adminPwd;

    public admin() {
    }

    public admin(String adminName, Integer adminId, String adminPwd) {
        this.adminName = adminName;
        this.adminId = adminId;
        this.adminPwd = adminPwd;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }
}
