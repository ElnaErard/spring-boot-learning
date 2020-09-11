package com.test.cdx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@SpringBootApplication
//将用户自定义配置 time_zone = Asia/Tokyo 覆盖默认配置
public class TestApplication {
    @Resource
    private ClockCalculate clockCalculate;
    @RequestMapping("/")
    String home(){
        return clockCalculate.CurrentTime();
    }
    public static void main(String[] args){
        SpringApplication.run(TestApplication.class, args);
    }
}
