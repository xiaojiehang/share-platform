package com.ad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create By  @林俊杰
 * 2020/7/31 20:18
 *
 * @version 1.0
 */
@Controller
public class HelloController {
    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
