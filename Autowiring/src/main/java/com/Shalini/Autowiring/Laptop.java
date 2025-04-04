package com.Shalini.Autowiring;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void build(){
        System.out.println("I'm a demo laptop");
    }

    public void compile(){
        System.out.println("I'm a demo laptop - interface");
    }

}