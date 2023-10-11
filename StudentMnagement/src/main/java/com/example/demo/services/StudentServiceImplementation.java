package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepositry;



@Service
public class StudentServiceImplementation implements StudentServices{
  StudentRepositry srepo;

public StudentServiceImplementation(StudentRepositry srepo) {
	super();
	this.srepo = srepo;
}

@Override
public String addStudent(Student s) {
	srepo.save(s);
	return "Student added successfully";
}

@Override
public Student getStudent(String kodId) {
	Student st=srepo.findById(kodId).get();
	return st;
}

@Override
public List<Student> getAllstudent() {
	List<Student> slist=srepo.findAll();;
	return slist;
}

@Override
public String updateStudent(Student s) {
	srepo.save(s);
	return "update sucessfully";
}

@Override
public String deleteStudent(String kodId) {
	srepo.deleteById(kodId);
	return "student delete successfully";
}
}
