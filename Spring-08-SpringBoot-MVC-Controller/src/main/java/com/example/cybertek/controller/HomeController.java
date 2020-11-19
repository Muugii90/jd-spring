package com.example.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, value ="/amazon")
     public String getRequestMapping(){

         return "body";
     }
    @RequestMapping ("/moogii")
    public String getRequestMapping1(){

        return "Home";
    }

    @RequestMapping ("/amazon")
    public String getRequestMapping2(){

        return "body";
    }

    @GetMapping("/spring")
    public String getMappingEx2(){
        return "Home";
    }

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable ("name")String name){
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String pathVariableEx1(@PathVariable ("name")String name,@PathVariable ("email")String email){

        System.out.println("Name is: " + name);
        System.out.println("Email is: " + email);
        return "home";
    }

    @GetMapping("/home/course")
    public String requestParamEx(@RequestParam ("course")String course){
        System.out.println("Course: "+ course);

        return "home";
    }

    @GetMapping(value="/course")
    public String requestParamEx2(@RequestParam (value = "name", required = false, defaultValue = "Moogii")String name){
        System.out.println("Course: "+name);

        return "home";
    }


}
