package com.example.Demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Dev {

    public void msg(){
        System.out.println("Build Web App");
    }

    @RequestMapping("/app")
    public String build(){
        return " Build Web App";
    }
}
