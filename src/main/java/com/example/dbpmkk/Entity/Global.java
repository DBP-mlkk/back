package com.example.dbpmkk.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "global")
public class Global {
    @Id
    @Column(name = "globalunq_NO", nullable = false)
    private Integer id;

    @Column(name = "global_NO", nullable = false)
    private Integer globalNo;

    @Column(name = "globalcom_No")
    private Integer globalcomNo;

    @Column(name = "techname", length = 20)
    private String techname;

    @Column(name = "global_City", length = 20)
    private String globalCity;

    @Column(name = "jobs", length = 20)
    private String jobs;

}