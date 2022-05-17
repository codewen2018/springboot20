package com.pt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Calendar;

@Controller
public class LoginController {


    @GetMapping("/login")
    public String login(Model model){

        int year = Calendar.getInstance().get(Calendar.YEAR);

        model.addAttribute("year",year);


        return "login";
    }

}
