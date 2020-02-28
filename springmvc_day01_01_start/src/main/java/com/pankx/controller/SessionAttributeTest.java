package com.pankx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 注解@SessionAttribute控制器实例
 */
@Controller
@RequestMapping("/Session")
public class SessionAttributeTest {

    /**
     * 注解@SessionAttribute
     * @return
     */

    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(Model model){
//        把Session存到request域对象当中，可以使用model对象的addAttribute方法
        model.addAttribute("userSession","testSession");
        System.out.println("testSessionAttribute执行了。。。。");
        return "success";
    }
}
