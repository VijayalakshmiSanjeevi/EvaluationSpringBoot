package com.example.demo.bo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student_test_new")
public class Student {

	@Id
	@GeneratedValue
    private int id;
    private String fullName;
    
    @OneToMany(mappedBy="student")
    private List<Subject> subjects;

    Student()
    {
    	
    }
    public Student(int id, String fullName, Subject...subjects) {
        this.id = id;
        this.fullName = fullName;
        this.subjects = Stream.of(subjects).collect(Collectors.toList());
        this.subjects.forEach(x ->x.setStudent(this));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
