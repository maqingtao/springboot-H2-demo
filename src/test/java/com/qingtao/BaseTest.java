package com.qingtao;

import com.qingtao.bean.ChooseCourse;
import com.qingtao.common.CommonForm;

import java.util.*;

/**
 * @author: maqingtao
 * @description: 获取查询条件类
 * @date: 2018-7-9
 * @modified:
 */
public class BaseTest {
    /**
     * @author: maqingtao
     * @description: 源数据，设置为了与查询数据进行比较验证
     * @date: create in 2018-7-9
     * @modified:
     */
    public static List<ChooseCourse> getRightList() {
        ChooseCourse chooseCourseOne = new ChooseCourse();
        chooseCourseOne.setId(1);
        chooseCourseOne.setStu_id("100023");
        chooseCourseOne.setStu_name("庆涛");
        chooseCourseOne.setCourse_id("12");
        chooseCourseOne.setCourse_name("c语言");
        chooseCourseOne.setChoose_date("2017-7");
        ChooseCourse chooseCourseTwo = new ChooseCourse();
        chooseCourseTwo.setId(2);
        chooseCourseTwo.setStu_id("100023");
        chooseCourseTwo.setStu_name("庆涛");
        chooseCourseTwo.setCourse_id("13");
        chooseCourseTwo.setCourse_name("java语言");
        chooseCourseTwo.setChoose_date("2017-7");
        List<ChooseCourse> list = new ArrayList<>();
        list.add(chooseCourseOne);
        list.add(chooseCourseTwo);
        return list;
    }

    /**
     * @author: maqingtao
     * @description: 构造正确的查询条件
     * @date: 2018-7-9
     * @modified:
     */
    public static CommonForm getRightCondition() {
        CommonForm commonForm = new CommonForm();
        commonForm.setStu_id("100023");
        commonForm.setChoose_date("2017-7");
        return commonForm;
    }

    /**
     * @author: maqingtao
     * @description: 构造错误的查询条件
     * @date: 2018-7-9
     * @modified:
     */
    public static CommonForm getErrorCondition() {
        CommonForm commonForm = new CommonForm();
        commonForm.setCourse_id("123");
        commonForm.setStu_id("d");
        return commonForm;
    }

    /**
    * @author: maqingtao
    * @description: 排序
    * @date: create in 2018-7-9
    * @modified:
    */
    public static void sorts(List<ChooseCourse> list)
    {
        Collections.sort(list, new Comparator<ChooseCourse>()
        {

            @Override
            public int compare(ChooseCourse o1, ChooseCourse o2) {
                return Integer.parseInt(String.valueOf(o1.getId()))-Integer.parseInt(String.valueOf(o2.getId()));
            }
        });

    }
    /**
     * @author: maqingtao
     * @description: 查询数据与实际数据进行比较
     * @date: 2018-7-9
     * @modified:
     */

    public static  boolean resultCompare(List<ChooseCourse> list) {
        List<ChooseCourse> resultList = getRightList();
        sorts(list);
        sorts(resultList);
        if (resultList.size() != list.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).toString().equals(resultList.get(i).toString())) {
                return false;
            }
        }
        return true;
    }
}
