package com.example.hong.service.impl;

import com.example.hong.dao.admin;
import com.example.hong.dao.jxDao;
import com.example.hong.pojo.juan;
import com.example.hong.service.jxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class jxServiceImpl implements jxService {

    @Resource
    private jxDao jxDao;

    @Override
    public int addDonate(String wname, String tem, String money) {
        return jxDao.addDonate(wname,tem,money);
    }

    @Override
    public List<juan> getjxList() {
        return jxDao.getjxList();
    }

    @Override
    public admin login(String adminName, String adminPwd) {
        return jxDao.login(adminName,adminPwd);
    }
}
