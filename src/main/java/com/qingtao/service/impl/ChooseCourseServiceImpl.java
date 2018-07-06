package com.qingtao.service.impl;

import com.qingtao.bean.ChooseCourse;
import com.qingtao.common.CommonForm;
import com.qingtao.repository.ChooseCourseRepository;
import com.qingtao.service.ChooseCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChooseCourseServiceImpl implements ChooseCourseService {
    @Autowired
    private ChooseCourseRepository courseRepository;
    //查找相关信息
    @Override
    public List<ChooseCourse> findCourseInformation(CommonForm commonForm) {
        //单条件查询
//        List<ChooseCourse> list=courseRepository.findChooseCourseByStu_id(commonForm.getStu_id());
        //多条件查询
        List<ChooseCourse> list=courseRepository.findChooseCourse(commonForm.getStu_id(),commonForm.getChoose_date());
        return list;
    }

    @Override
    public List<ChooseCourse> findAllData(CommonForm commonForm) {

        return null;
    }
}
