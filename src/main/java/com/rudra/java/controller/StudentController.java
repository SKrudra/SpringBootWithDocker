package com.rudra.java.controller;

import com.rudra.java.entity.Student;
import com.rudra.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("students")
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getStudents() {
        return studentService.findAll();
    }

    @PostMapping
    public void saveStudent(@RequestParam String name, @RequestParam int age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        studentService.save(student);
    }
}
