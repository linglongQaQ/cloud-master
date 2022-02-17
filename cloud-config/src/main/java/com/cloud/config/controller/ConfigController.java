package com.cloud.config.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
@RefreshScope
public class ConfigController {


    @Value("${name}")
    private String name;


    @GetMapping("/refresh")
    public String getConfigName(){

        return "your name is："+name;
    }

}
