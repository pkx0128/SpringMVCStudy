package com.pankx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 注解@CookieValue的控制器类
 */
@Controller
@RequestMapping("/Cookie")
public class CookieValueTest {
    /**
     * 注解@CookieValue实例
     *      作用：用于把指定Cookie名称的值传入控制器方法的参数中
     *      属性：
     *          value:用于指定Cookie的名称
     *          required:
     * @return
     */
    @RequestMapping("/cookieValueTest")
    public String cookieValueTest(@CookieValue("JSESSIONID") String cookie){
        System.out.println("cookieValueTest执行。。。。");
        System.out.println("cookie="+cookie);
        return "success";
    }
}
