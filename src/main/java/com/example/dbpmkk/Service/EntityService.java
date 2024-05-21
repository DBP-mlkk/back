package com.example.dbpmkk.Service;

import com.example.dbpmkk.Domain.Repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService {
    @Autowired
    private PolicyRepository policyRepository;

    public List<Global> getEntitiesByGlobalCity(String global_City){
        return policyRepository.findByglobalCity(global_City);
    }
}
