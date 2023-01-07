package com.example.sbmdemo.controller;

import com.alibaba.fastjson2.JSON;
import com.example.sbmdemo.pojo.User;
import com.example.sbmdemo.services.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/user")
    public String user(){
        List<User> userList = userService.getUserListService();
        System.out.println("UserController => " + JSON.toJSONString(userList));
        return JSON.toJSONString(userList);
    }

}
