package com.example.sbmdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.sbmdemo.mapper")
public class SbmDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbmDemoApplication.class, args);
    }

}
