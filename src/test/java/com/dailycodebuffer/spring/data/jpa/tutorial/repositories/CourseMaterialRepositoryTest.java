package com.dailycodebuffer.spring.data.jpa.tutorial.repositories;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.spring.data.jpa.tutorial.entities.Course;
import com.dailycodebuffer.spring.data.jpa.tutorial.entities.CourseMaterial;

@SpringBootTest
public class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository repository;

    @Test
    public void saveCourseMaterial(){
        Course course = Course.builder()
            .title("DSA")
            .credit(6)
            .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
            .url("www.dailycodebuffer.com")
            .course(course)
            .build();

        repository.save(courseMaterial);
    }

    @Test
    public void printAllCourseMaterials(){
        List<CourseMaterial> courseMaterials = repository.findAll();
        System.out.println("courseMaterials = " + courseMaterials);
    }

}
