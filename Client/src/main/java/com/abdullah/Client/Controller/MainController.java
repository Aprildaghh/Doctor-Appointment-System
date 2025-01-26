package com.abdullah.Client.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getMainPage(){
        return "mainPage";
    }

    @GetMapping("/register")
    public String getRegisterPage() {
        return "register";
    }

    @GetMapping("/search")
    public String searchDoctor(){
        return "searchDoctor";
    }

    @GetMapping("/appointment")
    public String appointment() {
        return "appointment";
    }

    @GetMapping("/rate")
    public String ratePage() {
        return "rate";
    }

}