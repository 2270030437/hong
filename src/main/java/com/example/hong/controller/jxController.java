package com.example.hong.controller;

import com.example.hong.service.jxService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class jxController {
    @Resource
    private jxService jxService;
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/donate")
    public String donate() {
        return "donate";
    }
}
