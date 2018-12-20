package com.example.hong.service.impl;

import com.example.hong.dao.jxDao;
import com.example.hong.service.jxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class jxServiceImpl implements jxService {

    @Resource
    private jxDao jxDao;
}
