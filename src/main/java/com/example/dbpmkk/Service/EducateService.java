package com.example.dbpmkk.Service;


import com.example.dbpmkk.Domain.EducateEntity;
import com.example.dbpmkk.Domain.PolicyEntity;
import com.example.dbpmkk.Repository.EducateEntityRepository;
import com.example.dbpmkk.Repository.PolicyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducateService {

    @Autowired
    private EducateEntityRepository educateRepository;

    public List<EducateEntity> getAllCourses() {
        return educateRepository.findAll();
    }
}