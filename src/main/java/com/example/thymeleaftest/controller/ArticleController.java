package com.example.thymeleaftest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/articles")
public class ArticleController {
    @GetMapping("/list")
    public String listAll(){
        return "/articles/list_all";
    }

    @GetMapping("/{id}")
    public String listOne(@PathVariable("id") int id, Model model){
        model.addAttribute("listId",id);
        return "/articles/list_one";
    }
//    create?name=tom&weight=80&height=180
    @GetMapping("/create")
    public String newHtml(@RequestParam("name") String name,
                          @RequestParam("weight") int weight,
                          @RequestParam("height") int height,
                          Model model){

        model.addAttribute("name",name);
        model.addAttribute("weight",weight);
        model.addAttribute("height",height);
        return "/articles/new";
    }
    @GetMapping("/{id}/update")
    public String idUpdate(@PathVariable("id") int id, Model model){
        model.addAttribute("updateId",id);
        return "/articles/update";
    }
    @GetMapping("/{id}/delete")
    public String idDelete(@PathVariable("id") int id, Model model){
        model.addAttribute("deleteId",id);
        return "/articles/delete_ok";
    }
}
