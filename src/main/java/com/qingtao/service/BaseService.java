package com.qingtao.service;

import com.qingtao.bean.ChooseCourse;
import com.qingtao.common.CommonForm;

import java.util.List;
/**
* @author: maqingtao
* @description: 作为基本查询接口，每个service接口都要继承
* @date: 2018-7-5
* @modified:
*/
public interface BaseService<T> {

    /**
     * @author: maqingtao
     * @description: 基本查询方法，commonForm为查询条件实体
     * @date: 2018-7-5
     * @modified:
     */
    @SuppressWarnings("rawtypes")
    List<ChooseCourse> findAllData(CommonForm commonForm);
}
