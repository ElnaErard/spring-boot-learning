package com.test.cdx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration
//测试类
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
