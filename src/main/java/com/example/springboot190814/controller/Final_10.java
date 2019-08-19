package com.example.springboot190814.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController

public class Final_10{
    @RequestMapping(value = "/final")
    public Object actionMethod(){
        RestTemplate restTemplate = new RestTemplate();
        String targetUrl = "https://api.openweathermap.org/data/2.5/forecast";
        String targetId = "?id=1835848";
        //seoul = 1835848
        //london = 2643743
        String targetAppId = "&appid=6f9ae8b913bb19ecc0ea4d0928364c1e";
        Object resultObject = restTemplate.getForObject(targetUrl+targetId+targetAppId, Object.class);
        return resultObject;
        
    }
}
