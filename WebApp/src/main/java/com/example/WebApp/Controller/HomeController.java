package com.example.WebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/Home")
    public String greet(){
        return "Welcome to the Application.";
    }
}
