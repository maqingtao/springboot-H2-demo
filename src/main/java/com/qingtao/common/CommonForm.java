package com.qingtao.common;

/**
 * @author: maqingtao
 * @description: 获取查询条件
 * @date: 2018-7-5
 * @modified:
 */
public class CommonForm {
    //学生学号
    private String stu_id;
    //课程号
    private String course_id;
    //选课时间
    private String choose_date;

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getChoose_date() {
        return choose_date;
    }

    public void setChoose_date(String choose_date) {
        this.choose_date = choose_date;
    }

    @Override
    public String toString() {
        return "CommonForm{" +
                "stu_id='" + stu_id + '\'' +
                ", course_id='" + course_id + '\'' +
                ", choose_date='" + choose_date + '\'' +
                '}';
    }


}
