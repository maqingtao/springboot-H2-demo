package com.qingtao.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.qingtao.ChooseCourseUtil;
import com.qingtao.bean.ChooseCourse;
import com.qingtao.bean.Results;
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
 * @description: 学生选课信息查询controller入口
 * @date: create 2018-7-5
 * @modified:
 */
@RestController
@RequestMapping(value = "/api")
public class ChooseCourseController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ChooseCourseService service;

    /**
    * @author: maqingtao
    * @description: 主要方法入口
    * @date: create in 2018-7-5
    * @modified: commonForm接收查询条件变量
    */
    @RequestMapping(value = "/findCourse", method = RequestMethod.POST, consumes = "application/json")
    public String findStudentCourse(@RequestBody CommonForm commonForm) {
        logger.info("parameter " + commonForm + "time " + System.currentTimeMillis());
        //根据条件得到查询数据
        List<ChooseCourse> list = service.findCourseInformationTwo(commonForm);
        if (list==null||list.size() == 0) {
            return JSON.toJSONString(Constant.ERROR_MESSAGE);
        }
        List<Results> result=ChooseCourseUtil.getSuccessResult(list);
        SimplePropertyPreFilter filter = new SimplePropertyPreFilter(
                ChooseCourse.class,Constant.STU_ID,Constant.STU_NAME,Constant.COURSE_ID,
                Constant.COURSE_NAME,Constant.CHOOSE_DATE);
        String results = JSON.toJSONString(result,filter);
        return results;
    }
}
