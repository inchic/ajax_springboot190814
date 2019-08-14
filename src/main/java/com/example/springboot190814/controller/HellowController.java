package com.example.springboot190814.controller;

//패키지의존재이유는 같은기능의 인터페이스/클래스 끼리 묶어서 정리하려고
//아마 demo.DemoApplication.java의 기능을 사용하기위해 이게 필요한건가??


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HellowController {
    @RequestMapping(value = "/resthellow")
    public String hellow() {
        return "welcome Hellow World !! ";
    }
}