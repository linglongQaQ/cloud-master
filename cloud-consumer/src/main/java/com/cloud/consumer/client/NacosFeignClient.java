package com.cloud.consumer.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("nacos-regist")
public interface NacosFeignClient {

    @GetMapping("regist/say")
    String say(@RequestParam  String name);
}
