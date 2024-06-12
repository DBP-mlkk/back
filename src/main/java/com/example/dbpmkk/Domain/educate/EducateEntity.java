package com.example.dbpmkk.Domain.educate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "educate", schema = "dbp_db")
public class EducateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Course_Nuber")
    private Integer CourseNuber;

    @Column(name = "Coures_year")
    private Integer CouresYear;

    @Column(name = "Course_Name", length = 300)
    private String CourseName;

    @Column(name = "Course_Link", length = 1000)
    private String CourseLink;

}