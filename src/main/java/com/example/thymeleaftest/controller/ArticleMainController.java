package com.example.thymeleaftest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleMainController {
    @GetMapping("/main")
    public String mainHtml(){
        return "/articles/main";
    }
}
