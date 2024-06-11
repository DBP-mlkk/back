package com.example.dbpmkk.Domain;

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
    @Column(name = "Course_nuber")
    private Integer courseNuber;

    @Column(name = "Coures_year")
    private Integer couresYear;

    @Column(name = "Course_name", length = 300)
    private String courseName;

    @Column(name = "Course_link", length = 1000)
    private String courseLink;

}