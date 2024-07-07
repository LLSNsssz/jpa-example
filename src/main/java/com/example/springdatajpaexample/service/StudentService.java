package com.example.springdatajpaexample.service;

import com.example.springdatajpaexample.domain.Students;
import com.example.springdatajpaexample.repository.StudentRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Students> selectAllStudents() {
        return studentRepository.findAll();
    }

    public Students insertStudent(Students student) {
        return studentRepository.save(student);
    }
}
