package com.leo.spring.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description
 * @Author wangss
 * @date 2020.03.10 15:07
 * @Version 1.0
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "leo spring hello";
    }

}
