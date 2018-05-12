package com.xbc.service.impl;

import com.xbc.database.dao.StudentMapper;
import com.xbc.database.model.Student;
import com.xbc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    public Student getStudent(String id) {
        return studentMapper.getUser(id);
    }

    @Override
    public void addStudent(Student student) {
        studentMapper.addUser(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.updateUser(student);
    }
}
