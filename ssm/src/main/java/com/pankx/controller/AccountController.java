package com.pankx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账号web
 */
@Controller
@RequestMapping("/account")
public class AccountController {
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
        return "list";
    }


}
