package com.rudra.java.controller;

import com.rudra.java.entity.Student;
import com.rudra.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student> getStudents() {
        return studentService.findAll();
    }

}
