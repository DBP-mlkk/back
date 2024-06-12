package com.example.dbpmkk.Service.policy;


import com.example.dbpmkk.Domain.policy.PolicyEntity;
import com.example.dbpmkk.Repository.policy.PolicyEntityRepository;
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

    public List<PolicyEntity> findByOrganization(String organization) {
        return repository.findByBusinessSupportOrganizationName(organization);
    }

    public List<PolicyEntity> findByBudgetRange(Long minBudget, Long maxBudget) {
        return repository.findByBudgetRange(minBudget, maxBudget);
    }

    public List<PolicyEntity> findByOrganizationAndBudgetRange(String organization, Long minBudget, Long maxBudget) {
        return repository.findByOrganizationAndBudgetRange(organization, minBudget, maxBudget);
    }

    public List<PolicyEntity> findByBusinessName(String businessName) {
        return repository.findByBusinessName(businessName);
    }

    public List<PolicyEntity> findByBusinessNameAndOrganization(String businessName, String organization) {
        return repository.findByBusinessNameAndOrganization(businessName, organization);
    }

    public List<PolicyEntity> findByBusinessNameAndBudgetRange(String businessName, Long minBudget, Long maxBudget) {
        return repository.findByBusinessNameAndBudgetRange(businessName, minBudget, maxBudget);
    }

    public List<PolicyEntity> findByBusinessNameAndOrganizationAndBudgetRange(String businessName, String organization, Long minBudget, Long maxBudget) {
        return repository.findByBusinessNameAndOrganizationAndBudgetRange(businessName, organization, minBudget, maxBudget);
    }

    public List<PolicyEntity> findByMinBudget(Long minBudget) {
        return repository.findByMinBudget(minBudget);
    }

    public List<PolicyEntity> findByMaxBudget(Long maxBudget) {
        return repository.findByMaxBudget(maxBudget);
    }

    public List<PolicyEntity> findByOrganizationAndMinBudget(String organization, Long minBudget) {
        return repository.findByOrganizationAndMinBudget(organization, minBudget);
    }

    public List<PolicyEntity> findByOrganizationAndMaxBudget(String organization, Long maxBudget) {
        return repository.findByOrganizationAndMaxBudget(organization, maxBudget);
    }

    public List<PolicyEntity> findByBusinessNameAndMinBudget (String businessName, Long minBudget) {
        return repository.findByBusinessNameAndMinBudget(businessName, minBudget);
    }

    public List<PolicyEntity> findByBusinessNameAndMaxBudget (String businessName, Long maxBudget) {
        return repository.findByBusinessNameAndMaxBudget(businessName, maxBudget);
    }
}