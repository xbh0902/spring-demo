package com.xbc.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-*.xml"})
public class RedisServiceTest {

    @Autowired
    private RedisService redisService;

    @Test
    public void setValue(){
        this.redisService.setValue("zhou", "wenbin");
        Assert.assertTrue(true);
    }

    @Test
    public void getValue(){
        String value = (String) redisService.get("zhou");
        Assert.assertEquals("wenbin", value);
    }
}
