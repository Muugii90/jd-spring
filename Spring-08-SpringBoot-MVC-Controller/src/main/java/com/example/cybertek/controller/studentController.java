package com.example.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class studentController {


        @RequestMapping("/show")
        public String showForm(){
            return "home";
        }

}
