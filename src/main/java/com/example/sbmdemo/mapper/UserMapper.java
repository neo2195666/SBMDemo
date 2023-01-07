package com.example.sbmdemo.mapper;


import com.example.sbmdemo.pojo.User;

import java.util.List;

public interface UserMapper {
    //增删改需要提交事物，查询不需要
    //查询语句
    public List<User> getUserList();
    //查询语句
    public User selectById(int id);
    //增加语句
    public int insertData(User user);
    //修改语句
    public int updateData(User user);
    //删除语句
    public int deleteData(int id);

    //resultType使用map
    public List<User> getUserList2();
}
