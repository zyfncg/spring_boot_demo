package com.software.microservice.Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello,Spring Boot";
    }
}
