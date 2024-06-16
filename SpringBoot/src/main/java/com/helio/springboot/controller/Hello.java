package com.helio.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping
    public String hello() {
        return "Hello World,and hello again!";
        //使用这一行注释测试github推送是否正常运行
    }
}
