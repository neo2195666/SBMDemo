package com.example.sbmdemo;

import com.example.sbmdemo.Utils.MybatisUtils;
import com.example.sbmdemo.mapper.UserMapper;
import com.example.sbmdemo.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SbmDemoApplicationTests {

    @Test
    void test1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList2();
        for (User user: userList){
            System.out.println(user);
        }
        sqlSession.close();
    }

}
