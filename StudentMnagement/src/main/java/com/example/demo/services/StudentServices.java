package com.example.demo.services;

import java.util.List;

import com.example.demo.Entity.Student;



public interface StudentServices {
   String addStudent(Student s);
   Student getStudent(String kodId);
   List<Student> getAllstudent();
   String updateStudent(Student s);
   String deleteStudent(String kodId);
}
