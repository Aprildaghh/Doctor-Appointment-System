package com.abdullah.Client.Controller;

import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {

    @GetMapping("/")
    public String getMainPage(){
        return "mainPage";
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model, @PathParam(value="isDoctor") int isDoctor) {
        model.addAttribute("isDoctor", isDoctor);
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