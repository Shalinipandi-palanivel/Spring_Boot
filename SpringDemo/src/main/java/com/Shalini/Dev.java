package com.Shalini;


public class Dev {

    // Injecting Laptop in Dev class - add reference of laptop in dev bean in spring.xml

    //GETTER-SETTER INJECTION

    private Laptop laptop;

    //int age; // if this is public we can access it from anywhere

   private int age; // To access private modifier generate getter-setter method
    //Also we can assign this age in the spring.xml file - <property>. Works only for getter-setter method
    int salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }


// CONSTRUCTOR INJECTION - Incase of multiple parameter use index in spring.xml constructor

    public Dev(int age,int salary){
        this.age =age;
        this.salary = salary;
    }

    public Dev(Laptop laptop){
        this.laptop = laptop;
    }

    public void debug(){
        System.out.println("Compiling");
        laptop.compile();
    }

}

