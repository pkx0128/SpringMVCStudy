package com.pankx.test;

import com.pankx.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

//    public static void main(String[] args){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        AccountService accountService = applicationContext.getBean("accountService",AccountService.class);
//        accountService.findAll();
//
//    }
    @Test
    public void run1(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.pankx");
        AccountService accountService = applicationContext.getBean("accountService",AccountService.class);
        accountService.findAll();
    }

}
