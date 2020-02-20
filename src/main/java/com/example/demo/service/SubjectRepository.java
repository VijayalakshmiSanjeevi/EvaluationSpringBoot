package com.example.demo.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bo.Subject;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Integer>{
	
	

}
