package com.pankx.controller;


import com.pankx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 账号web
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;
    /**
     * 测试方法
     * @return
     */
    @RequestMapping("/sayhi")
    public String sayHi(){
        System.out.println("sayHi方法执行。。。。");
        return "success";
    }

    @RequestMapping("/testfindAll")
    public String findAll(){
        System.out.println("表现层的查询所有用户的方法。。。。。");
        accountService.findAll();
        return "list";
    }
}
