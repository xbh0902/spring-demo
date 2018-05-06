package com.xbc.service;


import com.xbc.database.model.Student;


public interface StudentService{


    /**
     * 查询
     * @param id 用户ID
     * @return 返回用户信息
     */
    Student getStudent(String id);

    /**
     * 添加
     * @param student 用户信息
     */
    void addStudent(Student student);

}