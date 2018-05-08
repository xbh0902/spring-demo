package com.xbc.controller;

import com.xbc.api.base.ResponseContenner;
import com.xbc.database.model.Student;
import com.xbc.service.StudentService;
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

    @PatchMapping("/user")
    @ResponseBody ResponseContenner updateUser(@RequestBody Student student){
        studentService.updateStudent(student);
        return new ResponseContenner();
    }

    @DeleteMapping("/user")
    @ResponseBody ResponseContenner deleteUser(@RequestBody Student student){
        return new ResponseContenner();
    }

    @PutMapping("/user")
    @ResponseBody ResponseContenner addUser(@RequestBody Student student){

        studentService.addStudent(student);
        return new ResponseContenner();
    }
}
