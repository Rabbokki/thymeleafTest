package com.example.thymeleaftest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MyController {
    @GetMapping("/mypage")
    public String getMyPage(){
        return "myOldPage";
    }

    @GetMapping("/about")
    public String getAbout(){
        return "About";
    }
}
