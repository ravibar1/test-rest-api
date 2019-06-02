package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class APIControllerUnitTest {

    @Autowired
    private APIController apiController;


    @Test
    public void contextLoadAPIController_UnitTest(){
        assertThat(apiController).isNotNull();
    }
}
