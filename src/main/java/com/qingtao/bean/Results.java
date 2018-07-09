package com.qingtao.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * @author: maqingtao
 * @description: 返回规定的JSON格式
 * @date: create in 2018-7-9
 * @modified:
 */
public class Results<T> {
    //标记
    @JSONField(ordinal = 1)
    private String title;
    //内容实体
    @JSONField(ordinal = 2)
    private List<T> list;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }


}
