package com.example.springboot190814.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController

//나누기 전
public class restReturnController_b_06{
    @RequestMapping(value = "/ws/restreturn_b")
    public Object actionMethod(){
        List<Object> resultObject = new ArrayList<Object>();

        Map<String,Object> data01 = new HashMap<String, Object>();
        data01.put("MEMBER_ID","103029301202"); //해시맵에 데이터를 넣고
        resultObject.add(data01); // 그 해시맵을 리스트에 넣는다

        Map<String,Object> data02 = new HashMap<String, Object>();
        data02.put("PASSWORD","123123121211");
        resultObject.add(data02);

        // [list {hashmap{key,value}#1},{hashmap#2}, ... ] 이런식으로 들어가겠지

        return resultObject;
    }
}

