package com.example.SimpleWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String acceptRequest(){
        return "Hello Sadman!";
    }

    @RequestMapping("/about")
    public String about(){
        return "The web is being updated";
    }
}
