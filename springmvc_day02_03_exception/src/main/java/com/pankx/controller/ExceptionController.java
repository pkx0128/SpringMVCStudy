package com.pankx.controller;

import com.pankx.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping("/testException")
    public String testException() throws SysException{
        System.out.println("testException执行了。。。");
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            //
            throw new SysException("testException传来的自定义异常");
        }
        return "success";
    }
}
