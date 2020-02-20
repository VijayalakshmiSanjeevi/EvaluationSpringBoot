package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.bo.Student;
import com.example.demo.bo.Subject;
import com.example.demo.repository.StudentRepository;

//Test
@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	StudentRepository repository;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repository.save(new Student(1,"Student1",new Subject(1,"English",100)));
		repository.save(new Student(2,"Student1",new Subject(2,"Maths",100)));
		repository.save(new Student(3,"Student3",new Subject(3,"English",70)));
		repository.save(new Student(4,"Student4",new Subject(4,"English",90)));
		repository.save(new Student(5,"Student5",new Subject(5,"English",100)));
		
	}

    
}
