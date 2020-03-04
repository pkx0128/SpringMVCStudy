package com.pankx.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理类
 */
public class SysExceptionResolver implements HandlerExceptionResolver {
    /**
     * 处理异常的业务逻辑
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        //获取异常对象
        SysException sysException = null;
        if(e instanceof SysException){
            sysException = (SysException) e;
        }else{
            sysException = new SysException("处理异常类的消息。。。");
        }
        System.out.println(sysException);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("Msg",sysException.getMessages());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
