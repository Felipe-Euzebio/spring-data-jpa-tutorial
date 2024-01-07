package com.dailycodebuffer.spring.data.jpa.tutorial.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacherId;

    private String firstName;
    private String lastName;

    /*
    @OneToMany(
        cascade = CascadeType.ALL
    )
    @JoinColumn(
        name = "teacher_id",
        referencedColumnName = "teacherId"
    )
    private List<Course> courses;
    */

}
