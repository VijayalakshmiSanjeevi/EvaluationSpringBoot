package com.example.demo.service;

import com.example.demo.bo.Student;
import com.example.demo.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repository;
    @Override
    public Student save(Student request) {
        return repository.save(request);
    }

    @Override
    public List<Student> findAll() {
        return (List<Student>) repository.findAll();
    }

    @Override
    public Optional<Student> findById(int id) {
        return repository.findById(id);
    }

	@Override
	public List<Student> findAllSeventyFive() {
		// TODO Auto-generated method stub
		return null;
	}
}
