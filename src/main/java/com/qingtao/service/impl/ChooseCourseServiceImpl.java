package com.qingtao.service.impl;

import com.qingtao.bean.ChooseCourse;
import com.qingtao.common.CommonForm;
import com.qingtao.common.Constant;
import com.qingtao.repository.ChooseCourseRepository;
import com.qingtao.service.ChooseCourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: maqingtao
 * @description: 服务层实现类
 * @date: create in 2018-7-9
 * @modified:
 */
@Service
public class ChooseCourseServiceImpl implements ChooseCourseService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ChooseCourseRepository courseRepository;

    /**
     * @author: maqingtao
     * @description: 基本的@Query方法查询
     * @date: create in 2018-7-5
     * @modified:
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public List<ChooseCourse> findCourseInformation(CommonForm commonForm) {
        logger.info("commonForm " + commonForm + "Time " + System.currentTimeMillis());
        List<ChooseCourse> list = courseRepository.findChooseCourse(commonForm.getStu_id(), commonForm.getChoose_date());
        return list;
    }

    /**
     * @author: maqingtao
     * @description: 根据stu_id, course_id, choose_date组合进行查询
     * @date: create in 2018-7-5
     * @modified:
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public List<ChooseCourse> findCourseInformationTwo(CommonForm commonForm) {
        logger.info("commonForm " + commonForm + "Time " + System.currentTimeMillis());
        //构造匹配条件
        if (commonForm!=null) {
            ChooseCourse chooseCourse = new ChooseCourse();
            chooseCourse.setCourse_id(commonForm.getCourse_id());
            chooseCourse.setStu_id(commonForm.getStu_id());
            chooseCourse.setChoose_date(commonForm.getChoose_date());
            ExampleMatcher matcher = ExampleMatcher.matching()
                    .withStringMatcher(ExampleMatcher.StringMatcher.DEFAULT)
                    .withIgnoreCase(true)
                    .withMatcher(Constant.STU_ID, ExampleMatcher.GenericPropertyMatchers.startsWith())
                    .withMatcher(Constant.COURSE_ID, ExampleMatcher.GenericPropertyMatchers.startsWith())
                    .withMatcher(Constant.CHOOSE_DATE, ExampleMatcher.GenericPropertyMatchers.startsWith())
                    .withIgnorePaths(Constant.STU_NAME, Constant.COURSE_NAME, Constant.ID);
            Example<ChooseCourse> ex = Example.of(chooseCourse, matcher);
            //使用JPA自带的方法访问
            List<ChooseCourse> list = courseRepository.findAll(ex);
            return list;
        }
        else {
            return null;
        }
    }

    @Override
    public List<ChooseCourse> findAllData(CommonForm commonForm) {

        return null;
    }
}
