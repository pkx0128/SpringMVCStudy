package com.pankx;

import com.pankx.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
        response.sendRedirect(request.getContextPath()+"/index.jsp");
        return;
    }
}
