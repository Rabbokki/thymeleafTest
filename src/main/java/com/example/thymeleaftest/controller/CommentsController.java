package com.example.thymeleaftest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CommentsController {
    @GetMapping("/articles/{id}/articleComment")
    public String showAllComments(
            @PathVariable("id") int articleId,
            Model model
    ){
        model.addAttribute("articleId",articleId);
        return "/articles/comments/comment_view";
    }
}
