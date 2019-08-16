package com.example.springboot190814.controller;



import com.example.springboot190814.service.RestReturnService_06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController

//나눈 후
public class restReturnController_06{
    @Autowired
    RestReturnService_06 restReturnService;

    @RequestMapping(value = "/ws/restreturn")
    
    public Object actionMethod(){

        Object resultObject = new Object();
        resultObject = restReturnService.actionMethod();

        return resultObject;
    }
}

