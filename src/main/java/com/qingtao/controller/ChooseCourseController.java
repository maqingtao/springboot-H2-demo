package com.qingtao.controller;

import com.alibaba.fastjson.JSON;
import com.qingtao.bean.ChooseCourse;
import com.qingtao.common.CommonForm;
import com.qingtao.common.Constant;
import com.qingtao.service.ChooseCourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author: maqingtao
 * @description:
 * @date: create 2018-7-5
 * @modified:
 */
@RestController
@RequestMapping(value = "/api")
public class ChooseCourseController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ChooseCourseService service;
    @RequestMapping(value = "/findCourse",method = RequestMethod.POST, consumes = "application/json")
    public String findStudentCourse(@RequestBody CommonForm commonForm) {
        logger.info("parameter "+commonForm+"time "+System.currentTimeMillis());
     List<ChooseCourse> list=service.findCourseInformation(commonForm);
         if (list.size()==0) {
         return JSON.toJSONString(Constant.ERROR_MESSAGE);
     }
     String str=JSON.toJSONString(list);
        return str;
    }
}
