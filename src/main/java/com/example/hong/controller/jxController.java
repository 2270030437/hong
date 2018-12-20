package com.example.hong.controller;

import com.example.hong.dao.admin;
import com.example.hong.pojo.juan;
import com.example.hong.service.jxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class jxController {
    @Resource
    private jxService jxService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    @RequestMapping("/text")
    public String text() {
        return "text";
    }

    @RequestMapping("/DZ")
    public String DZ() {
        return "DZ";
    }

    @RequestMapping("/login")
    public String login(@RequestParam String adminName, @RequestParam String adminPwd, HttpSession session) {
        admin admin = jxService.login(adminName, adminPwd);
        session.setAttribute("adminName", admin.getAdminName());
        return "forward:/getjxList";
    }

    @RequestMapping("/donate")
    public String donate() {
        return "donate";
    }

    @RequestMapping("/addDonate")
    public String addDonate(@RequestParam String wname, @RequestParam String tem, @RequestParam String money) {
        int result = jxService.addDonate(wname, tem, money);
        if (result > 0) {
            return "ok";
        }
        return "donate";
    }

    @RequestMapping("/getjxList")
    public String getjxList(Model model, HttpSession session) {
        String adminName = (String) session.getAttribute("adminName");
        if (adminName != null) {
            List<juan> list = jxService.getjxList();
            model.addAttribute("list", list);
            return "getjxList";
        }
        return "forward:/DZ";

    }
}
