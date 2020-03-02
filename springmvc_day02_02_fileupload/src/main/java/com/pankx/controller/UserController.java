package com.pankx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/fileupdate")
    public String fileupdate(){
    System.out.println("fileupdate执行了。。。。");
        return "success";
    }
}
