package com.dailycodebuffer.spring.data.jpa.tutorial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.spring.data.jpa.tutorial.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{ 
} 
