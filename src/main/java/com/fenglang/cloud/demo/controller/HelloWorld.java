package com.fenglang.cloud.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author fenglang
 * @Date 2019-8-5 16:51
 * @Version 1.0
 **/
@RestController
public class HelloWorld {
    @GetMapping("/test/{id}")
    public String test(@PathVariable String id){
        return "hello"+id.toString();
    }
}
