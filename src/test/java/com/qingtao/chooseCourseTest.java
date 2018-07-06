package com.qingtao;

import com.qingtao.bean.ChooseCourse;
import com.qingtao.common.CommonForm;
import com.qingtao.service.ChooseCourseService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class chooseCourseTest {
    @Autowired
    private ChooseCourseService chooseCourseService;
    public static CommonForm commonForm=new CommonForm();
    @Before
    public void setValue()
    {
        commonForm.setStu_id("200023");
        commonForm.setCourse_id("12");
        commonForm.setChoose_date("2017-1");
    }

    @Test
    public void serviceTestOne()
    {
        List<ChooseCourse> list=chooseCourseService.findCourseInformation(commonForm);
        assertNotNull(list);
        assertTrue(list.size()>0);
    }
}
