package com.pankx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 注解@PathVarible实例控制器类
 */
@Controller
@RequestMapping("/PathVarible")
public class PathVaribleTest {
    /**
     * 注解@PathVarible实例
     *         作用：用于绑定url中的占位符
     *         属性：
     *              value:用于指定url中占位符的名称
     *              required:是否必须提供占位符
     * @param id
     * @return
     */
    @RequestMapping("/pathvaribletest/{id}")
    public String pathVaribleTest(@PathVariable("id") String id){
        System.out.println("pathVaribleTest执行。。。。。");
        System.out.println("id="+id);
        return "success";
    }
}
