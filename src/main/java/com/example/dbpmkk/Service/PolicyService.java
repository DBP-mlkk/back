package com.example.dbpmkk.Service;


import com.example.dbpmkk.Domain.PolicyEntity;
import com.example.dbpmkk.Repository.PolicyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {

   private final PolicyEntityRepository repository;

   @Autowired
   public PolicyService(PolicyEntityRepository repository) {
       this.repository = repository;
   }

    public List<PolicyEntity> findAll() {
        return repository.findAll();
    }
}
