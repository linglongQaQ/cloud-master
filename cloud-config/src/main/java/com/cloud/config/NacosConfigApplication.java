package com.cloud.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class NacosConfigApplication {


    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApplication.class);
        log.info("service start succ");
    }
}
