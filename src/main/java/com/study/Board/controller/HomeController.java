package com.study.Board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //시작주소를 받아주는 메서드를 가짐
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
