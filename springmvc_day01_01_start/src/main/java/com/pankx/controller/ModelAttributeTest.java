package com.pankx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @注解@ModelAttribute控制器类
 */
@Controller
@RequestMapping("/modelAttribute")
public class ModelAttributeTest {

    /**
     * 注解@ModelAttribute实例
     *      作用：
     *          a.用在方法上表示当前方法会在控制器方法执行之前执行
     *          b.用在参数上用于获取指定数据给参数赋值
     * @return
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttributeOnfunction(@ModelAttribute("uname") String uname){
        System.out.println("testModelAttributeOnfunction执行了。。。。");
        System.out.println("uname="+uname);
        return "success";
    }
    @ModelAttribute
    public void testa(@ModelAttribute("uname") String name){
        System.out.println("testa执行了。。。");
        System.out.println("name="+ name);
    }
}
