package com.pankx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 控制器类
 */
@Controller
@RequestMapping(path = "/helloController")
public class HelloController {
    /**
     * 入门案例
     * @return
     */
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello word!!");
        return "success";
    }

    /**
     * 注解@RequestMapping使用实例
     * 1.如果注解用在类中的方法上可以设置为一级目录，如：/requestMapping就可以访问
     * 2.如果在类上可以设置为二级目录，如：/helloController/requestMapping才能访问
     * 属性：
     *      path:设置请求的url地址，与value属性作用相同
     *      method:设置请求的方式，如：method={RequestMethod.GET}
     *      params:设置请求的参数，请求传递的参数名必须与此参数设置的内容相同如parames = {"name"}则请求传递的参数名必须包涵一个参数名为name的参数
     * @return
     */
    @RequestMapping(path = "/requestMapping",method = {RequestMethod.GET},params = {"name"})
    public String requestMapping(){
        System.out.println("测试注解@RequestMapping的使用。。。");
        return "success";
    }
}
