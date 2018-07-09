package com.qingtao.chooseservice;

import com.alibaba.fastjson.JSON;
import com.qingtao.BaseTest;
import com.qingtao.DemoApplication;
import com.qingtao.bean.ChooseCourse;
import com.qingtao.common.CommonForm;
import com.qingtao.common.Constant;
import com.qingtao.service.ChooseCourseService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class chooseCourseServiceTest {
    @Autowired
    private ChooseCourseService chooseCourseService;

    /**
     * @author: maqingtao
     * @description: @Query查询service测试(正确查询条件)
     * @date: create in 2018-7-9
     * @modified:
     */
    @Test
    public void serviceTestOne() {
        List<ChooseCourse> list = chooseCourseService.findCourseInformation(BaseTest.getRightCondition());
        assertNotNull(list);
        assertTrue(list.size() > 0);
    }

    /**
     * @author: maqingtao
     * @description: findAll查询service测试(正确查询条件)
     * @date: create in 2018-7-9
     * @modified:
     */
    @Test
    public void serviceTestTwo() {
        List<ChooseCourse> list = chooseCourseService.findCourseInformationTwo(BaseTest.getRightCondition());
        assertNotNull(list);
        assertTrue(list.size() > 0);
    }
    /**
     * @author: maqingtao
     * @description: findAll查询service测试(无满足条件的结果)
     * @date: create in 2018-7-9
     * @modified:
     */
    @Test
    public void serviceTestErrorOne()
    {
        List<ChooseCourse> list=chooseCourseService.findCourseInformationTwo(BaseTest.getErrorCondition());
        assertTrue(list.size()==0);
    }

    /**
     * @author: maqingtao
     * @description: findAll查询service测试(空值)
     * @date: create in 2018-7-9
     * @modified:
     */
    @Test
    public void serviceTestErrorTwo()
    {
        List<ChooseCourse> list=chooseCourseService.findCourseInformationTwo(null);
        assertNull(list);
    }

}
