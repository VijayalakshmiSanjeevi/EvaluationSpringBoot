package com.example.demo.service;

import com.example.demo.bo.Student;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


public interface StudentService {

    Student save(Student request);

    List<Student> findAll();

    Optional<Student> findById(int id);
    
    List<Student> findAllSeventyFive();
    
}
