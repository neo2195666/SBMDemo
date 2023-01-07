package com.example.sbmdemo.services.Impl;

import com.alibaba.fastjson2.JSON;
import com.example.sbmdemo.mapper.UserMapper;
import com.example.sbmdemo.pojo.User;
import com.example.sbmdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserListService() {
        List<User> userList = userMapper.getUserList();
        System.out.println("UserServiceImpl => " + JSON.toJSONString(userList));
        return userList;
    }
}
