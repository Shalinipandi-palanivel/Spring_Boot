package com.example.Demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App {

    @RequestMapping("/")
    // @RestBody - if we want to return the page or file in case of enterprise application
    // @RestBody if we use rest body annotation make the rest controller as @controller
    public String greet(){
        return "Hello. Demo Spring Boot project";
    }

    public void compCheck(){
        System.out.println("Checking the component annotation ");
    }


}
