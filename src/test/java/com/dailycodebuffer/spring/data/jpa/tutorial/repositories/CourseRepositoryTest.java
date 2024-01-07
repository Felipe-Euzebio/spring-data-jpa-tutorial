package com.dailycodebuffer.spring.data.jpa.tutorial.repositories;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.spring.data.jpa.tutorial.entities.Course;
import com.dailycodebuffer.spring.data.jpa.tutorial.entities.Teacher;

@SpringBootTest
public class CourseRepositoryTest {

    @Autowired
    private CourseRepository repository;

    @Test
    public void printCourses(){
        List<Course> courses = repository.findAll();
        System.out.println("courses = " + courses);
    }

    @Test
    public void saveCourseWithTeacher(){
        Teacher teacher = Teacher.builder()
            .firstName("Ranga")
            .lastName("Karana")
            .build();

        Course course = Course.builder()
            .title("Python")
            .credit(6)
            .teacher(teacher)
            .build();

        repository.save(course);
    }

}
