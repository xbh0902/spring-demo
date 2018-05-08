package com.xbc.database.dao;


import com.xbc.database.model.Student;

public interface StudentMapper {

    Student getUser(String id);

    void addUser(Student student);

    void updateUser(Student student);
}
