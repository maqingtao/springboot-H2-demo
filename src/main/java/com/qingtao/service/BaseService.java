package com.qingtao.service;

import com.qingtao.bean.ChooseCourse;
import com.qingtao.common.CommonForm;

import java.util.List;
/**
* @author: maqingtao
* @description: 作为基本查询接口，每个service接口都要继承，优点是能够使代码更为精简
* @date: 2018-7-5
* @modified:
*/
public interface BaseService<T> {

    //根据所传条件的到查询数据
    @SuppressWarnings("rawtypes")
    List<ChooseCourse> findAllData(CommonForm commonForm);
}
