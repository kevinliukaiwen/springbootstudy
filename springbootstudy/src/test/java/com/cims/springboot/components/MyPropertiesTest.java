package com.cims.springboot.components;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Author kwliu
 * @Description
 * @Date 2018/5/27
 * @Modified
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MyPropertiesTest {
    @Autowired
    private MyProperties myProperties;
    @Test
    public void getHello() {
        Assert.assertEquals(myProperties.getName(),"kevin");
        Assert.assertEquals("hello",myProperties.getTitle());
        System.out.println(myProperties.getDesc());
    }

}