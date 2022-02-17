package com.cloud.consumer.controller;

import com.cloud.consumer.client.NacosFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class NacosConsumerController {

    @Autowired
    private NacosFeignClient nacosFeignClient;

    @RequestMapping("cus")
    public String hello(@RequestParam String name){
        return nacosFeignClient.say(name);
    }
}
