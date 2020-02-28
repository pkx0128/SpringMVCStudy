package com.pankx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * 注解@SessionAttribute控制器实例
 */
@Controller
@RequestMapping("/Session")
@SessionAttributes(value = {"userSession"})//把userSession存入到session域中
public class SessionAttributeTest {

    /**
     * 注解@SessionAttribute
     *      作用：用于多次执行控制器之间的数据共享
     *      属性:
     *          value：用于指定存入的属性名称
     *          types：用于指定存入的数据类型
     * @return
     */

    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(Model model){
//        把Session存到request域对象当中，可以使用model对象的addAttribute方法
        model.addAttribute("userSession","testSession");
        System.out.println("testSessionAttribute执行了。。。。");
        return "success";
    }

    /**
     * 获取Session域的值
     * @param modelMap
     * @return
     */
    @RequestMapping("/testGetSessionAtrribute")
    public String getSessionAtrribute(ModelMap modelMap){
        String session = (String) modelMap.get("userSession");
        System.out.println("testGetSessionAtrribute执行了。。。。");
        System.out.println(session);
        return "success";
    }

    /**
     * 删除session的值
     * @param status
     * @return
     */
    @RequestMapping("/testDelSessionAtrribute")
    public String delSessionAttribute(SessionStatus status){
        System.out.println("delSessionAttribute执行了。。。");
        status.setComplete();
        return "success";
    }
}
