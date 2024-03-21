package com.atguigu.mpdemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.List;

@Data
public class User {
    private int id;
    private String name;
    private int age;
    private String email;
    //一对一
    //@TableField(exist = false)
    //private Course course;

    //一对多
    @TableField(exist = false)
    private List<Course> courses;

}
