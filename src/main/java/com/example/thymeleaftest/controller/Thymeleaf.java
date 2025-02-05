package com.example.thymeleaftest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic")
public class Thymeleaf {
    @GetMapping("text-basic")
    public String textBasic(Model model){
        model.addAttribute("name","안유진");
        model.addAttribute("mylove","마이럽");
        return "/basic/text-basic";
    }
}
