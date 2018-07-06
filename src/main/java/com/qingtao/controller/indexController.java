package com.qingtao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
public class indexController {
    @RequestMapping("/")
    public String helloHtml() {
        return "/index";
    }

}
