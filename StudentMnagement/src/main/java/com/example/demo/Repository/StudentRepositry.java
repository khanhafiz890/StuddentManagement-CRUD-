package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Student;



public interface StudentRepositry extends JpaRepository<Student, String> {

}
