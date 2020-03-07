package com.xujun.demo.quick.controller.HelloWorldController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XuJun
 * @create 2020-03-07 10:35
 **/

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello")
    public String helloWorld() {
        return "Hello World !!!";
    }
}
