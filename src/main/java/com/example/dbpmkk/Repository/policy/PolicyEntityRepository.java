package com.example.dbpmkk.Repository.policy;

import com.example.dbpmkk.Domain.policy.PolicyEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PolicyEntityRepository extends JpaRepository<PolicyEntity, Integer> {

    List<PolicyEntity> findByBusinessSupportOrganizationName(String businessSupportOrganizationName);


    @Query(value = "SELECT * FROM support WHERE Business_support_organization_name LIKE %:organization% AND CAST(Business_support_budget AS UNSIGNED) BETWEEN :minBudget AND :maxBudget", nativeQuery = true)
    List<PolicyEntity> findByOrganizationAndBudgetRange(
            @Param("organization") String organization,
            @Param("minBudget") Long minBudget,
            @Param("maxBudget") Long maxBudget);

    @Query(value = "SELECT * FROM support WHERE CAST(Business_support_budget AS UNSIGNED) BETWEEN :minBudget AND :maxBudget", nativeQuery = true)
    List<PolicyEntity> findByBudgetRange(
            @Param("minBudget") Long minBudget,
            @Param("maxBudget") Long maxBudget);

    // New Queries for businessName
    @Query("SELECT p FROM PolicyEntity p WHERE p.businessName LIKE %:businessName%")
    List<PolicyEntity> findByBusinessName(@Param("businessName") String businessName);

    @Query(value = "SELECT * FROM support WHERE Business_name LIKE %:businessName% AND Business_support_organization_name LIKE %:organization%", nativeQuery = true)
    List<PolicyEntity> findByBusinessNameAndOrganization(
            @Param("businessName") String businessName,
            @Param("organization") String organization);

    @Query(value = "SELECT * FROM support WHERE Business_name LIKE %:businessName% AND CAST(Business_support_budget AS UNSIGNED) BETWEEN :minBudget AND :maxBudget", nativeQuery = true)
    List<PolicyEntity> findByBusinessNameAndBudgetRange(
            @Param("businessName") String businessName,
            @Param("minBudget") Long minBudget,
            @Param("maxBudget") Long maxBudget);

    @Query(value = "SELECT * FROM support WHERE Business_name LIKE %:businessName% AND Business_support_organization_name LIKE %:organization% AND CAST(Business_support_budget AS UNSIGNED) BETWEEN :minBudget AND :maxBudget", nativeQuery = true)
    List<PolicyEntity> findByBusinessNameAndOrganizationAndBudgetRange(
            @Param("businessName") String businessName,
            @Param("organization") String organization,
            @Param("minBudget") Long minBudget,
            @Param("maxBudget") Long maxBudget);
}
