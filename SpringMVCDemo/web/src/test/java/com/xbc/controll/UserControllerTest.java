package com.xbc.controll;

import com.xbc.controller.UserController;
import com.xbc.database.model.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:spring-*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserControllerTest {

    @Autowired
    private UserController userController;


    @Test
    public void getUser(){

        Student user = userController.getUser("1");
        Assert.assertEquals("123123", user.getPassword());
    }
}
