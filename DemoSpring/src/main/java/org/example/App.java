package org.example;
import org.springframework.context.*;
import org.springframework.context.support.*;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Dev dev = (Dev) context.getBean("dev");
        dev.build();
       // dev.setAge(22);
        //System.out.println("Dev Age (Setter injection): "+dev.getAge());
       // System.out.println("Dev Age (constructor arg) : "+dev.getAge());
    }
}
