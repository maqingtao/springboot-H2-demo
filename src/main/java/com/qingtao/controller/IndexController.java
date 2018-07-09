package com.qingtao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
/**
* @author: maqingtao
* @description: 查询页面访问
* @date: create in 2018-7-9
* @modified:
*/
@Controller
public class IndexController {

    /**
     * @author: maqingtao
     * @description: 跳转到index页面
     * @date: create in 2018-7-9
     * @modified:
     */
    @RequestMapping("/")
    public String helloHtml() {
        return "/index";
    }

}
