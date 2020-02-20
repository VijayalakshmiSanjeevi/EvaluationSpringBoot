package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bo.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

//    @Override
//    public List findAll() {
//        return null;
//    }
//
//    @Override
//    public Object findById(int id) {
//        return null;
//    }
//	public List<Student> findAllByMarks(int mark);
}
