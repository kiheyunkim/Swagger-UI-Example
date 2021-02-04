package com.kihyeonkim.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IDE : IntelliJ IDEA
 * Created by kiheyunkim@gmail.com on 2021-02-04
 * Github : http://github.com/kiheyunkim
 * Comment : 테스트용 Controller2
 */
@RestController
@RequestMapping("/test2")
public class SwaggerController2 {
    @GetMapping("/get")
    public String getHandler(String param1, Integer param2){
        return "";
    }
}
