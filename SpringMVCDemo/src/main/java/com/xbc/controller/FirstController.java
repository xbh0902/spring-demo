package com.xbc.controller;

import com.alibaba.fastjson.JSON;
import com.xbc.database.model.Student;
import com.xbc.service.StudentService;
import com.xbc.service.impl.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FirstController {

    final private Logger logger = LoggerFactory.getLogger(FirstController.class);

    @Autowired
    StudentService studentService;

    @GetMapping("/user")
    @ResponseBody Student getUser(){
        Student student = studentService.getStudent("1");
        return student;
    }

    @PutMapping("/user")
    @ResponseBody
    com.xbc.api.base.ResponseBody addUser(@RequestBody Student student){

        studentService.addStudent(student);
        return new com.xbc.api.base.ResponseBody();
    }
}
