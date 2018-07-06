package com.qingtao.service;

import com.qingtao.bean.ChooseCourse;
import com.qingtao.common.CommonForm;

import java.util.List;

public interface ChooseCourseService extends BaseService<ChooseCourse>{
    /**
    * @author: maqingtao
    * @description: 查询选课信息
    * @date: create in 2018-7-6
    * @modified:
    */
   List<ChooseCourse> findCourseInformation(CommonForm commonForm);
}
