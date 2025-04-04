package com.Shalini;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        // Traditional of creating an object
//        Dev obj = new Dev();
//        obj.msg();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
          Dev obj1 = (Dev)context.getBean("dev");
//        Laptop obj2 = (Laptop)context.getBean("lap");

//          obj1.setAge(10); // assigning the value if it's a getter-setter injection
          obj1.salary=20000;

        System.out.println(obj1.getAge());
        System.out.println(obj1.salary);
        obj1.debug();

    }
}
