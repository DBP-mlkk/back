package com.example.dbpmkk.Service.educate;


import com.example.dbpmkk.Domain.educate.EducateEntity;
import com.example.dbpmkk.Repository.educate.EducateEntityRepository;
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