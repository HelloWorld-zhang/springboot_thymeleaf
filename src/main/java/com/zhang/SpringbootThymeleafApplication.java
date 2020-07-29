package com.zhang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.zhang.dao")
public class SpringbootThymeleafApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootThymeleafApplication.class, args);
    }

}
