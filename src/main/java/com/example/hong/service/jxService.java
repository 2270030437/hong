package com.example.hong.service;

import com.example.hong.dao.admin;
import com.example.hong.pojo.juan;

import java.util.List;

public interface jxService {
    int addDonate(String wname, String tem, String money);

    List<juan> getjxList();

    admin login(String adminName, String adminPwd);
}
