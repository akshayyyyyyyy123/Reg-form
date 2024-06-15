package com.akshay.example.explore.Controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class API {

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/myInfo")
    public String userInfo(@RequestParam("name") String name, @RequestParam("id") int id, @RequestParam("email") String email,
                           @RequestParam("department") String department, Model model) {
        model.addAttribute("name",name);
        model.addAttribute("id", id);
        model.addAttribute("email", email);
        model.addAttribute("department", department);
        return "userInfo";
    }
}
