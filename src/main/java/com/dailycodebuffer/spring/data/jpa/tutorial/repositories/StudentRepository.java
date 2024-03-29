package com.dailycodebuffer.spring.data.jpa.tutorial.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dailycodebuffer.spring.data.jpa.tutorial.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{ 

    public List<Student> findByFirstName(String firstName);

    public List<Student> findByFirstNameContaining(String name);

    public List<Student> findByLastNameNotNull();

    public List<Student> findByGuardianName(String guardianName);

    public Student findByFirstNameAndLastName(String firstName, String lastName);

    // JPQL 
    @Query("select s from Student s where s.emailId = ?1")
    public Student getStudentByEmailAddress(String emailId);

    // JPQL 
    @Query("select s.firstName from Student s where s.emailId = ?1")
    public String getStudentFirstNameByEmailAddress(String emailId);

    // Native
    @Query(
        value = "SELECT * FROM tbl_student s where s.email_address = ?1",
        nativeQuery = true
    )
    Student getStudentByEmailAddressNative(String emailId);

    // Native
    @Query(
        value = "SELECT * FROM tbl_student s where s.email_address = :emailId",
        nativeQuery = true
    )
    Student getStudentByEmailAddressNativeNamedParam(
        @Param("emailId") String emailId
    );

    @Modifying
    @Transactional
    @Query(
        value = "UPDATE tbl_student set first_name = ?1 where email_address = ?2",
        nativeQuery = true
    )
    int updateStudentNameByEmailId(String firstName, String emailId);

} 
