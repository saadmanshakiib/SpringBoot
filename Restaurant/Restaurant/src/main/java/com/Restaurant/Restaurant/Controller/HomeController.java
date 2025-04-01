package com.Restaurant.Restaurant.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
@GetMapping("/home")
    public String sayHello(){
    return "This is the homepage";
}

    @GetMapping("/login")
    public String login(){
    return "This is the login page";
    }
}
