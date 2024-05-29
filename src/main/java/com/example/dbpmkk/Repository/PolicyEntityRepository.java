package com.example.dbpmkk.Repository;

import com.example.dbpmkk.Domain.PolicyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PolicyEntityRepository extends JpaRepository<PolicyEntity, Integer> {
    List<PolicyEntity> findByBusinessSupportOrganizationName(String organizationName);
}

