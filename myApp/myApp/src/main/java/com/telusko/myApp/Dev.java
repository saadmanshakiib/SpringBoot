package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    //autowired connects the type of class with this class we describe after this line

    private Computer comp;
// here the Dev class connects the Computer class with itself
    // here laptop is basically a part of computer because it implements computer
    public void build(){
        comp.compile();
        System.out.println("I am Building a Project");
    }
}
