package com.pankx.controller;

import com.pankx.domain.Person;
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

    /**
     * 请求参数封装到实体类（如：javaBean等）的绑定实例
     * 提交表单中的输入框的name的值需要与javaBean中的成员变量名相同
     * @param person
     * @return
     */
    @RequestMapping(path = "/javaBeanParams")
    public String javaBeanParams(Person person){
        System.out.println("javaBeanParams执行。。。。。");
//        System.out.println("name:"+person.getName());
//        System.out.println("sex:"+person.getSex());
//        System.out.println("age:"+person.getAge());
        System.out.println(person);
        return "success";
    }

    /**
     * 自定义类型转换器
     * @param person
     * @return
     */
    @RequestMapping(path = "/defType")
    public String defType(Person person){
        System.out.println("defType执行。。。。。");
        System.out.println(person);
        return "success";
    }
}
