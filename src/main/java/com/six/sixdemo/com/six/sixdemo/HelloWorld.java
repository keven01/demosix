package com.six.sixdemo.com.six.sixdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wuhang")
public class HelloWorld {

    @RequestMapping
    public String hello() {
        return "Hello Spring-Boot,you are smart!";
    }
}