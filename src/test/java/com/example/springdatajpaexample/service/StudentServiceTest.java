package com.example.springdatajpaexample.service;

import static org.junit.jupiter.api.Assertions.*;

import com.example.springdatajpaexample.domain.Students;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void insertTest() {
        //기분
        Students student = new Students("", 30, "");
        studentService.insertStudent(student);
    }
}