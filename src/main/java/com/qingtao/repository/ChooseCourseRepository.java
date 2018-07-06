package com.qingtao.repository;

import com.qingtao.bean.ChooseCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ChooseCourseRepository extends JpaRepository<ChooseCourse,Long> {
    @Modifying
    @Query(value = "select * from stu_choose_course  s where s.stu_id=?1", nativeQuery = true)
    List<ChooseCourse> findChooseCourseByStu_id(String stu_id);

    @Modifying
    @Query(value = "select * from stu_choose_course  s where s.stu_id=?1 and s.choose_date=?2", nativeQuery = true)
    List<ChooseCourse> findChooseCourse(String stu_id,String choose_date);


}
