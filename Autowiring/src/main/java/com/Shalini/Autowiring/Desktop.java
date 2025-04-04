package com.Shalini.Autowiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // @Primary - used to describe which should be displayed first
public class Desktop implements Computer{

    public void debug(){
        System.out.println("I'm a demo desktop");
    }
    public void compile(){
        System.out.println("I'm a demo desktop - interface");
    }

}
