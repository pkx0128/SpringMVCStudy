package com.pankx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 注解@RequestParam实例控制器类
 */
@Controller
@RequestMapping("/RequestParam")
public class RequestParamDemo {

    /**
     * @RequestParam注解实例
     *      作用：
     *          把请求中指定名称的参数给控制器中的形参赋值
     *      属性：
     *          value、name：用途一样，都是指请求参数中的名称
     *          required:请求参数中是否必须提供此参数，默认为true，表示必须提供，否则报错
     * @param username
     * @return
     */
    @RequestMapping("/param")
    public String requestParam(@RequestParam(name="name") String username){
        System.out.println("requestParam执行。。。。");
        System.out.println("username:"+username);
        return "success";
    }
}
