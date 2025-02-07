package com.example.thymeleaftest.controller;

import com.example.thymeleaftest.dto.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FormController {
    @GetMapping("/userForm")
    public String showForm(){
        return "/form/basicForm";
    }

    @GetMapping("/sendData")
    public String sendData(@RequestParam("nickname")String nickname, @RequestParam("email") String email, Model model){
        model.addAttribute("nickname",nickname);
        model.addAttribute("email",email);
        return "/form/returnForm";
    }
    @PostMapping("/sendData")
    public String sendPostData(Model model,
                               UserInfo info){
        model.addAttribute("nickname",info.getNickname());
        model.addAttribute("email",info.getEmail());
        return "/form/returnForm";
    }

//    @PostMapping("/sendData")
//    public String sendPostData(@RequestParam("nickname")String nickname, @RequestParam("email") String email, Model model){
//        model.addAttribute("nickname",nickname);
//        model.addAttribute("email",email);
//        return "/form/returnForm";
//    }
}
