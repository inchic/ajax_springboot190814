package com.example.springboot190814.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

public class RestfulPostController_07{
    // @Autowired
    // RestReturnService restReturnService;

    @RequestMapping(value = "/api/post", method = {RequestMethod.GET, RequestMethod.POST})
    public String getParamWithAjax(){
        return "Welcome to Hellow World!!";
    }
}