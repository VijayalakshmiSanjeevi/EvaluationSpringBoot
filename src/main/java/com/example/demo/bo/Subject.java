package com.example.demo.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="subject_test")
public class Subject {

	@Id
	@GeneratedValue
    private int id;
    private String subjectName;
    private int mark;

    Subject()
    {
    	
    }
    public Subject(int id, String subjectName, int mark) {
        this.id = id;
        this.subjectName = subjectName;
        this.mark = mark;
    }

    @ManyToOne
    @JoinColumn
    private Student student;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getMark() {
        return mark;
    }

    public void setStudent(Student student)
    {
    	this.student = student;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
}
