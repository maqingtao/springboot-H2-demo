package com.qingtao.service;

import com.qingtao.bean.ChooseCourse;
import com.qingtao.common.CommonForm;

import java.util.List;

/**
 * @author: maqingtao
 * @description: 查询选课信息
 * @date: create in 2018-7-6
 * @modified:
 */
public interface ChooseCourseService extends BaseService<ChooseCourse> {
    /**
     * @author: maqingtao
     * @description: 使用@Query基本方法进行查询，commonForm为查询条件的实体类
     * @date: create in 2018-7-6
     * @modified:
     */
    List<ChooseCourse> findCourseInformation(CommonForm commonForm);

    /**
     * @author: maqingtao
     * @description: 使用JPA自带方法进行操作查询，commonForm为查询条件的实体类
     * @date: create in 2018-7-6
     * @modified:
     */
    List<ChooseCourse> findCourseInformationTwo(CommonForm commonForm);
}
