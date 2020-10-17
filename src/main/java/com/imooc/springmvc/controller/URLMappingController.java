package com.imooc.springmvc.controller;

import com.imooc.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/um")
public class URLMappingController {
    @GetMapping("/g")
//    @RequestMapping(value = "/g",method = RequestMethod.GET)
    @ResponseBody
    public String getMapping(@RequestParam("manager_name") String abc){
        System.out.println("manager_name:"+abc);
        return "this is get method";
    }
    @PostMapping("/p")
    @ResponseBody
    public String postMapping(String username,Long password){
        System.out.println(username+":"+password);
        return "this is post method";
    }

    @PostMapping("/p1")
    @ResponseBody
    public String postMapping1(User user){
        System.out.println(user.getUsername()+":"+user.getPassword());
        return "This is post method";
    }
}
