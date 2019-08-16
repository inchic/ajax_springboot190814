package com.example.springboot190814.controller;

import com.example.springboot190814.service.OrganizationService_05;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class OrganizationController_05 {
    @Autowired
    OrganizationService_05 organizationService;

    @RequestMapping(value = "/ws/organization")

    public Object actionMethod() {
        Object resultObject = new Object();
        resultObject = organizationService.actionMethod();
        return resultObject;
    }
}


// @Service
// public class OrganizationService{
//     public Object actionMethod(){
//         Map<String,Object> resultObject=new HashMap<String,Object>();
//         resultObject.put("MEMBER_ID","293029301202");
//         resultObject.put("PASSWORD","1234123121");
//         resultObject.put("NAME","HONG GIL DONG");
//         resultObject.put("BIRTH","18001121");
        
//         return resultObject;
//     }
// }