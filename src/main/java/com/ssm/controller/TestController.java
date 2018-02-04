package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dllo on 18/2/4.
 */
@Controller
public class TestController {

    @RequestMapping(value = {"","/"})
    public String index(){
        return "index";
    }

}
