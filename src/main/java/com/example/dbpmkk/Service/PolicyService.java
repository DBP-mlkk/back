package com.example.dbpmkk.Service;

import com.example.dbpmkk.Mapper.PolicyMapper;
import org.springframework.stereotype.Service;
import com.example.dbpmkk.Domain.Entity.PolicyEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class PolicyService {
    @Autowired
    private PolicyMapper policyMapper;

    public List<PolicyEntity> getAllPolicies() {
        return policyMapper.selectAllPolicy();

    }
}
