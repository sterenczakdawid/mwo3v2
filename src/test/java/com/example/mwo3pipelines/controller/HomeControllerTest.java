package com.example.mwo3pipelines.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeControllerTest {
    @Test
    void numberTest() {
        //given
        int num = 9;

        //when
        int result = HomeController.returnNumber(num);

        //then
        assertEquals(num, result);
    }
}
