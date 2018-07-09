package com.qingtao;

import com.qingtao.bean.ChooseCourse;
import com.qingtao.bean.Results;
import com.qingtao.common.Constant;

import java.util.ArrayList;
import java.util.List;

/**
* @author: maqingtao
* @description: 工具类
* @date: create in 2018-7-9
* @modified:
*/
public class ChooseCourseUtil {
    /**
     * @author: maqingtao
     * @description: 得到正确的JSON格式的转换
     * @date: create in 2018-7-9
     * @modified:
     */
    public static List<Results> getSuccessResult(List<ChooseCourse> list){
         List<Results> results=new ArrayList<>();
         Results<ChooseCourse> result=new Results<>();
         result.setTitle(Constant.CHOOSE_TITLE);
         result.setList(list);
         results.add(result);
         return results;

    }
}
