package com.pankx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请求参数绑定控制器
 */
@Controller
@RequestMapping(path = "/params")
public class ParamsTest {
    /**
     * 请求参数绑定
     * 需要请参数的名称与方法paramsTest参数名一样Springmvc就会自动把请求参数的值传到方法内
     * @param name
     * @param age
     * @return
     */
    @RequestMapping(path = "/testParams")
    public String testParams(String name,int age){
        System.out.println("请求参数绑定实例执行。。。。。");
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        return "success";
    }
}
