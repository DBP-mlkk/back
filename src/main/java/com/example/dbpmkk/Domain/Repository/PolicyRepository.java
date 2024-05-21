package com.example.dbpmkk.Domain.Repository;

import com.example.dbpmkk.Domain.Entity.PolicyInfo;
import org.springframework.data.repository.Repository;


public interface PolicyRepository extends Repository<PolicyInfo, Integer> {
    public PolicyInfo save(PolicyInfo policyInfo);
    public PolicyInfo findOne(Integer id);
}
