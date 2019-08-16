package com.example.springboot190814.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class RestReturnService_06 {
    public Object actionMethod() {

        List<Object> resultObject = new ArrayList<Object>();
        Map<String, Object> data01 = new HashMap<String, Object>();
        data01.put("MEMBER_ID", "103029301202"); // 해시맵에 데이터를 넣고
        resultObject.add(data01); // 그 해시맵을 리스트에 넣는다

        Map<String, Object> data02 = new HashMap<String, Object>();
        data02.put("PASSWORD", "123123121211");
        resultObject.add(data02);

        Map<String,Object> data03 = new HashMap<String, Object>();
        data03.put("NAME","GUMMY BEAR LOVE");
        resultObject.add(data03);

        Map<String,Object> data04 = new HashMap<String, Object>();
        data04.put("E-MAIL","HARIBO@KILLBEAR.COM");
        resultObject.add(data04);

        return resultObject;
    }
}
