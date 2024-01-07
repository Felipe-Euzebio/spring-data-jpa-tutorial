package com.dailycodebuffer.spring.data.jpa.tutorial.repositories;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.spring.data.jpa.tutorial.entities.Course;
import com.dailycodebuffer.spring.data.jpa.tutorial.entities.Teacher;

@SpringBootTest
public class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository repository;

    @Test
    public void saveTeacher(){
        Course courseDBA = Course.builder()
            .title("DBA")
            .credit(5)
            .build();

        Course courseJava = Course.builder()
            .title("Java")
            .credit(6)
            .build();

        Teacher teacher = Teacher.builder()
            .firstName("Ramesh")
            .lastName("Fadatare")
            .courses(List.of(courseDBA, courseJava))
            .build();

        repository.save(teacher);
    }

}
