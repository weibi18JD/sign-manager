package com.iwy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by weibi on 2017/7/1.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/test")
    public String test(){
        return "demo";
    }
}
