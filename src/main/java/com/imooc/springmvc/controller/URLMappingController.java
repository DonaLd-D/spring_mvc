package com.imooc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class URLMappingController {
    @GetMapping("/g")
    @ResponseBody
    public String getMapping(){
        return "this is get method";
    }
    @PostMapping("/p")
    @ResponseBody
    public String postMapping(){
        return "this is post method";
    }
}
