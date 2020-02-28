package com.pankx;

import com.pankx.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 响应返回值为String实例
     * @return
     */
    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString执行了....");
//        模拟从数据库读取值
        Person person = new Person();
        person.setName("pppp");
        person.setAge(19);
        model.addAttribute(person);
        return "success";
    }
}
