package com.dailycodebuffer.spring.data.jpa.tutorial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dailycodebuffer.spring.data.jpa.tutorial.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{
}
