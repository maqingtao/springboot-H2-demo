package com.qingtao.bean;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.core.annotation.Order;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: maqingtao
 * @description: 选课信息实体类
 * @date: create in 2018-7-5
 * @modified:
 */
@Entity
@Table(name = "stu_choose_course")
public class ChooseCourse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //学生学号
    @JSONField(ordinal = 1)
    private String stu_id;
    //学生姓名
    @JSONField(ordinal = 2)
    private String stu_name;
    //课程号
    @JSONField(ordinal = 3)
    private String course_id;
    //课程名
    @JSONField(ordinal = 4)
    private String course_name;
    //选课时间
    @JSONField(ordinal = 5)
    private String choose_date;

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ChooseCourse{" +
                "id=" + id +
                ", stu_id='" + stu_id + '\'' +
                ", stu_name='" + stu_name + '\'' +
                ", course_id='" + course_id + '\'' +
                ", course_name='" + course_name + '\'' +
                ", choose_date='" + choose_date + '\'' +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getChoose_date() {
        return choose_date;
    }

    public void setChoose_date(String choose_date) {
        this.choose_date = choose_date;
    }

}
