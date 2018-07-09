package com.qingtao.repository;

import com.qingtao.bean.ChooseCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
* @author: maqingtao
* @description: 基本查询方法接口
* @date: create in 2018-7-9
* @modified:
*/
public interface ChooseCourseRepository extends JpaRepository<ChooseCourse, Long> {

    // 根据学生学号查询选课信息
    @Modifying
    @Query(value = "select * from stu_choose_course  s where s.stu_id=?1", nativeQuery = true)
    List<ChooseCourse> findChooseCourseByStu_id(String stu_id);

    // 根据学生学号和选课时间查询选课信息
    @Modifying
    @Query(value = "select * from stu_choose_course  s where s.stu_id=?1 and s.choose_date=?2", nativeQuery = true)
    List<ChooseCourse> findChooseCourse(String stu_id, String choose_date);


}
