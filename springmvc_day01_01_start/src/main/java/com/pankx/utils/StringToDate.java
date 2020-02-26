package com.pankx.utils;

import javafx.scene.input.DataFormat;
import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义字串转日期的类型转换
 */
public class StringToDate implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        if(s==null){
            throw new RuntimeException("生日不能为空");
        }
//        设置日期格式
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
//            字符串转换为日期，并返回
            return dateFormat.parse(s);
        } catch (Exception e) {
           throw  new RuntimeException("类型转换出错");
        }
    }
}
