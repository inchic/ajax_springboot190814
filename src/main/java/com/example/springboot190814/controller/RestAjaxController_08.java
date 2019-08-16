package com.example.springboot190814.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

public class RestAjaxController_08{
    @RequestMapping(value = "/api/ajax", method = {RequestMethod.GET, RequestMethod.POST})

    public String getParamWithAjax(@RequestParam Map<String,Object> paramMap){
        // String str = (String) paramMap.get("title");
        return "Welcome to Hellow World!!";


       
    }
}