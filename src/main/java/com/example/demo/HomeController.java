package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping  ("/")
        public String index2(){
            return "index2";
        }
    @RequestMapping("/Welcome")
    public String profile() {
        return "Welcome";
    }
    }

