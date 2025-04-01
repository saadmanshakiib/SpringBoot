package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Dekstop implements Computer {
    public Dekstop(){
        System.out.println("Dekstop Constructor");
    }
    public void compile(){
        System.out.println("Compiling with Dekstop");
    }
}
