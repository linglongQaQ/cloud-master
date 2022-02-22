package com.cloud.register.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("regist")
@Api(tags = "服务注册模块")
public class NacosRegisterController {


    @GetMapping("say")
    public String sayHi(@RequestParam String name){

        return "Hi "+ name;
    }

    @ApiOperation(value = "购买")
    @GetMapping("buy")
    public String buy(){

        return "buy a book!";
    }

}
