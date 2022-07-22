package com.deploy.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String main(){
        return "hello";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}

