package com.Shalini.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    //Autowiring replaces the ApplicationContext usage

//    @Autowired // Field Injection
//    private Desktop desktop;

//    @Autowired
//    private Laptop laptop;

//    Constructor Injection - Autowired not required here
//    private Desktop desktop;
//    public Dev(Desktop desktop){
//        this.desktop = desktop;
//    }

    //we use interface
    @Autowired @Qualifier("laptop")
    private Computer comp;

    public void compile(){
       comp.compile();
       System.out.println("Autowire Annotation");
    }

}
