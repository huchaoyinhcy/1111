package com.itheima.zds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/zds")
@RestController
public class ZdsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZdsApplication.class, args);
    }
@RequestMapping("/test")
    public String zds() {
        return "zhangdiaosi";
    }
}
