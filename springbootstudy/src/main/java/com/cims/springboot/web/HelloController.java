package com.cims.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author kwliu
 * @Description
 * @Date 2018/5/27
 * @Modified
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String getHello() {
        return "Hello World!";
    }
 }
