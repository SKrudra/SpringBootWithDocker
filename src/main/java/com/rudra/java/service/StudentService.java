package com.rudra.java.service;

import com.rudra.java.entity.Student;
import com.rudra.java.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll(){return studentRepository.findAll();}

    public void save(Student student) {
        studentRepository.save(student);
    }
}
