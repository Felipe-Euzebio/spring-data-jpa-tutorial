package com.dailycodebuffer.spring.data.jpa.tutorial.repositories;

import java.security.Guard;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.spring.data.jpa.tutorial.entities.Guardian;
import com.dailycodebuffer.spring.data.jpa.tutorial.entities.Student;

@SpringBootTest
// @DataJpaTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
            .firstName("John")
            .lastName("Doe")
            .emailId("john.doe@gmail.com")
            .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {
        Guardian guardian = Guardian.builder()
            .name("John Doe")
            .email("john.doe@example")
            .mobile("1234567890")
            .build();

        Student student = Student.builder()
            .firstName("Shivam")
            .lastName("Kumar")
            .emailId("shivam@gmail.com")
            .guardian(guardian)
            .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        System.out.println("studentList = " + studentList);
    }
    
}
