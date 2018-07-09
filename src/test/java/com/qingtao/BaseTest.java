package com.qingtao;

import com.qingtao.common.CommonForm;
/**
* @author: maqingtao
* @description: 获取查询条件类
* @date: 2018-7-9
* @modified:
*/
public class BaseTest {

    /**
     * @author: maqingtao
     * @description: 构造正确的查询条件
     * @date: 2018-7-9
     * @modified:
     */
    public static CommonForm getRightCondition()
    {
        CommonForm commonForm=new CommonForm();
        commonForm.setStu_id("100023");
        commonForm.setCourse_id("12");
        commonForm.setChoose_date("2017-7");
        return commonForm;
    }
    /**
     * @author: maqingtao
     * @description: 构造错误的查询条件
     * @date: 2018-7-9
     * @modified:
     */
    public static CommonForm getErrorCondition()
    {
        CommonForm commonForm=new CommonForm();
        commonForm.setCourse_id("123");
        commonForm.setStu_id("d");
        return commonForm;
    }
}
