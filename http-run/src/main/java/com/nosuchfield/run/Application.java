package com.nosuchfield.run;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
@SpringBootApplication
public class Application implements CommandLineRunner {
    @Resource
    private RunIt runIt;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    public void run(String... strings) throws Exception {
        runIt.hello();
    }
}
