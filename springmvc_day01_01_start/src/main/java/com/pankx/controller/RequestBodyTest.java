package com.pankx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 注解@RequestBody实例
 */
@Controller
@RequestMapping("/requestbody")
public class RequestBodyTest {
    /**
     * 注解@RequestBody实例
     *      作用：
     *          用于获取请求体的内容直接使用取到的是key1=value1&key2=value2...结构的数据，get请求不适用
     *      属性：
     *          requred:为是否必须有请求体，默认值为true,get请求方式会报错。如果设置为false时，get请求得到的值为null
     *
     * @param body
     * @return
     */
    @RequestMapping("/requestBodyDemo")
    public String requestBodyDemo(@RequestBody String body){
        System.out.println("requestBodyDemo执行。。。");
        System.out.println(body);
        return "success";
    }
}
