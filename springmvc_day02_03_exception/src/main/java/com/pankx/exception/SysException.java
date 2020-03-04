package com.pankx.exception;

/**
 * 自定义的异常类
 */
public class SysException extends Exception {
    //异常信息
    private String messages;

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public SysException(String messages){
        this.messages = messages;
    }
}
