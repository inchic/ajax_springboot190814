package com.example.springboot190814.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class OrganizationService{
    public Object actionMethod(){
        Map<String,Object> resultObject=new HashMap<String,Object>();
        resultObject.put("MEMBER_ID","293029301202");
        resultObject.put("PASSWORD","1234123121");
        resultObject.put("NAME","HONG GIL DONG");
        resultObject.put("BIRTH","18001121");
        
        return resultObject;
    }
}