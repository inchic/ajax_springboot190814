package com.example.springboot190814.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class RestWSController {
    @RequestMapping(value = "/ws/restcontroller")
    public Object actionMethod() {
        Map<String,Object> resultObject = new HashMap<String,Object>();
        resultObject.put("Member_ID", "293029301202");
        resultObject.put("CellPhone", "001-3923-6940");
        resultObject.put("Age", "29");
        resultObject.put("Password", "123123123");

        return resultObject;
        //맵을던진다, 백엔드영역
        //04ajax_restReturnMap.html
    }
}