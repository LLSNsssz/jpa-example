package com.example.springdatajpaexample.controller;

import com.example.springdatajpaexample.domain.Students;
import com.example.springdatajpaexample.service.StudentService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController는 return 값을 json의 형태로 변경
@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Students> getAllStudents() {
        return studentService.selectAllStudents();
    }
}
