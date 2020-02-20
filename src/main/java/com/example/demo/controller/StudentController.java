package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bo.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	@RequestMapping("/students")
	public List<Student> getAllStudents()
	{
		return service.findAll();
		
	}
	@RequestMapping("/student/{id}")
	public Optional<Student> getStudent(@PathVariable int id)
	{
		return service.findById(id);
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student)
	{
		return service.save(student);
	}
	public List<Student> getStudentsMoreThanSeventyFive()
	{
		return service.findAll();

	}
}
