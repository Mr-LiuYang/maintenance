package com.lairong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuyang on 2017/9/15
 */
@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/")
    public String test(){
        return "maintenance";
    }
    @RequestMapping("/hello")
    @ResponseBody
    public String test1(){
        return "maintenance";
    }
}
