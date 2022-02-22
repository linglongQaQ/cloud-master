package com.cloud.consumer.controller;

import com.cloud.consumer.client.NacosFeignClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
@Api(tags = "消费服务")
public class NacosConsumerController {

    @Autowired
    private NacosFeignClient nacosFeignClient;

    @GetMapping("cus")
    public String hello(@RequestParam String name){
        return nacosFeignClient.say(name);
    }


    @GetMapping("buy")
    @ApiOperation(value = "测试接口",tags = "返回测试信息")
    public String buy(){
        return nacosFeignClient.buy();
    }
}
