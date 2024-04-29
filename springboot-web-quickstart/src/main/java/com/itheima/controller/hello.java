package com.itheima.controller;

import com.itheima.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

//请求处理类
@RestController
public class hello {

    @RequestMapping("/hello")
    public String Hello(String name,Integer age){
        //System.out.println("Hello World!");
        System.out.println(name+" "+age);
        return "ok";
    }

    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user.getName()+user.getAge());
        return user.toString();
    }

    @RequestMapping("/updateTime")
    public String updateTime(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime){
        System.out.println(updateTime);
        return "OK";
    }


    @RequestMapping("/jasonParam")
    public String Jason(@RequestBody User user){
        System.out.println(user.getName()+user.getAge());
        return "OK";
    }
}
