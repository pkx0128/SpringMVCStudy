package com.pankx.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 定义javaBean Person
 */
public class Person implements Serializable {
    private String name;
    private String sex;
    private int age;
    private Date birthday;

//    private User user;
//    private List<User> list;
//    private Map<String,User> map;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public User getUser() {
////        return user;
////    }
////
////    public void setUser(User user) {
////        this.user = user;
////    }


//    public List<User> getList() {
//        return list;
//    }
//
//    public void setList(List<User> list) {
//        this.list = list;
//    }
//
//    public Map<String, User> getMap() {
//        return map;
//    }
//
//    public void setMap(Map<String, User> map) {
//        this.map = map;
//    }


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
