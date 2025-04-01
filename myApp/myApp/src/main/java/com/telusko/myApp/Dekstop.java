package com.telusko.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //-> it will remove the confusion as we declared both component annotation
// the primary annotation will catch the class to run
public class Dekstop implements Computer {

    public void compile(){
        System.out.println("Compiling the code with dekstop");
    }
}
