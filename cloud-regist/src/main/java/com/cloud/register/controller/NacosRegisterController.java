package com.cloud.register.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("regist")
public class NacosRegisterController {


    @GetMapping("say")
    public String sayHi(@RequestParam String name){

        return "Hi "+ name;
    }

}
