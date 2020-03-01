package com.pankx;

import com.pankx.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

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

    /**
     * 响应没有返回值时如何跳
     *  1.使用原生Servlet的api
     *      a.使用HttpServletRequest对象的请求转发实例
     *      b.使用HttpServletResponse对象的重定向
     *  2.直接响应
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid执行了。。。。");
//       1.使用HttpServletRequest对象的请求转发
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
//         2.使用HttpServletResponse对象的重定向
//        response.sendRedirect(request.getContextPath()+"/index.jsp");
//        3.对请求直接响应
//        处理中响应中文乱码问题
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("你好");
        return;
    }

    /**
     * 返回值为ModelAndView
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("testModelAndView执行了。。。");
//        模拟从数据库查询到值
        Person person = new Person();
        person.setName("modelandview");
        person.setAge(11);

//        创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
//        把person存到request域对象中
        modelAndView.addObject(person);
//        设置跳转的页面
        modelAndView.setViewName("success");
        return modelAndView;
    }

    /**
     *使用关键字forward和Redirect跳转页面
     * @return
     */
    @RequestMapping("/testForwardAndRedirect")
    public String testForwardAndRedirect(){
        System.out.println("testForwardAndRedirect执行了。。。。");

//        使用关键字forward请求转发
//        return "forward:/WEB-INF/pages/success.jsp";
//        使用关键字redirect重定向
        return "redirect:/index.jsp";
    }

    /**
     *响应客户端发过来的Json类型数据的异步请求
     * @param person
     */
    @RequestMapping("/testJson")
    public @ResponseBody Person testJson(@RequestBody Person person){
        System.out.println("testJson执行了。。。。。");
        System.out.println(person);
        //模拟数据库查询
        Person person1 = new Person();
        person1.setName("pankx");
        person1.setAge(22);
        return person1;
    }

}
