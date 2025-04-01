package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
   // private Laptop laptop;
   // @Autowired
    private Computer computer;
    private int age;

   public void setComputer(Computer computer){
        this.computer = computer;
    }
    public Computer getComputer(){
        return this.computer;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public Dev(){
        System.out.println("Dev Constructor");
    }
    public Dev(int age){
        this.age = age;
    }
    public void build(){
        System.out.println("Building spring without boot");
        computer.compile();
    }
}
