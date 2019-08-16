package com.example.springboot190814.controller;

import com.example.springboot190814.service.OrganizationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class OrganizationController {
    @Autowired
    OrganizationService organizationService;

    @RequestMapping(value = "/ws/organization")

    public Object actionMethod() {
        Object resultObject = new Object();
        resultObject = organizationService.actionMethod();
        return resultObject;
    }
}
