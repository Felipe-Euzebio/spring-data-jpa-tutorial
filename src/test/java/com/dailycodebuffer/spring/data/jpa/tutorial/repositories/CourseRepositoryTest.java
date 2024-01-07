package com.dailycodebuffer.spring.data.jpa.tutorial.repositories;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.spring.data.jpa.tutorial.entities.Course;

@SpringBootTest
public class CourseRepositoryTest {

    @Autowired
    private CourseRepository repository;

    @Test
    public void printCourses(){
        List<Course> courses = repository.findAll();
        System.out.println("courses = " + courses);
    }

}
