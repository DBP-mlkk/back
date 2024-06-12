package com.example.dbpmkk.Repository;

import com.example.dbpmkk.Domain.PolicyEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PolicyEntityRepository extends JpaRepository<PolicyEntity, Integer> {

    List<PolicyEntity> findByBusinessSupportOrganizationName(String businessSupportOrganizationName);

    // 조건부 로직이 포함된 쿼리
    @Query(value = "SELECT * FROM support WHERE " +
            "(:organization IS NULL OR Business_support_organization_name LIKE %:organization%) " +
            "AND (CAST(Business_support_budget AS SIGNED) >= IFNULL(:minBudget, 0)) " +
            "AND (CAST(Business_support_budget AS SIGNED) <= IFNULL(:maxBudget, 9223372036854775807))", nativeQuery = true)
    List<PolicyEntity> findByOrganizationAndBudgetRange(
            @Param("organization") String organization,
            @Param("minBudget") Long minBudget,
            @Param("maxBudget") Long maxBudget);

    @Query(value = "SELECT * FROM support WHERE " +
            "CAST(Business_support_budget AS SIGNED) >= IFNULL(:minBudget, 0) " +
            "AND CAST(Business_support_budget AS SIGNED) <= IFNULL(:maxBudget, 9223372036854775807)", nativeQuery = true)
    List<PolicyEntity> findByBudgetRange(
            @Param("minBudget") Long minBudget,
            @Param("maxBudget") Long maxBudget);

    // businessName 관련 새 쿼리
    @Query("SELECT p FROM PolicyEntity p WHERE p.businessName LIKE %:businessName%")
    List<PolicyEntity> findByBusinessName(@Param("businessName") String businessName);

    @Query(value = "SELECT * FROM support WHERE " +
            "Business_name LIKE %:businessName% " +
            "AND (:organization IS NULL OR Business_support_organization_name LIKE %:organization%)", nativeQuery = true)
    List<PolicyEntity> findByBusinessNameAndOrganization(
            @Param("businessName") String businessName,
            @Param("organization") String organization);

    @Query(value = "SELECT * FROM support WHERE " +
            "Business_name LIKE %:businessName% " +
            "AND (CAST(Business_support_budget AS SIGNED) >= IFNULL(:minBudget, 0)) " +
            "AND (CAST(Business_support_budget AS SIGNED) <= IFNULL(:maxBudget, 9223372036854775807))", nativeQuery = true)
    List<PolicyEntity> findByBusinessNameAndBudgetRange(
            @Param("businessName") String businessName,
            @Param("minBudget") Long minBudget,
            @Param("maxBudget") Long maxBudget);

    @Query(value = "SELECT * FROM support WHERE " +
            "Business_name LIKE %:businessName% " +
            "AND (:organization IS NULL OR Business_support_organization_name LIKE %:organization%) " +
            "AND (CAST(Business_support_budget AS SIGNED) >= IFNULL(:minBudget, 0)) " +
            "AND (CAST(Business_support_budget AS SIGNED) <= IFNULL(:maxBudget, 9223372036854775807))", nativeQuery = true)
    List<PolicyEntity> findByBusinessNameAndOrganizationAndBudgetRange(
            @Param("businessName") String businessName,
            @Param("organization") String organization,
            @Param("minBudget") Long minBudget,
            @Param("maxBudget") Long maxBudget);

    // 추가된 쿼리
    @Query(value = "SELECT * FROM support WHERE " +
            "Business_name LIKE %:businessName% " +
            "AND (CAST(Business_support_budget AS SIGNED) >= :minBudget)", nativeQuery = true)
    List<PolicyEntity> findByBusinessNameAndMinBudget(
            @Param("businessName") String businessName,
            @Param("minBudget") Long minBudget);
    @Query(value = "SELECT * FROM support WHERE " +
            "Business_name LIKE %:businessName% " +
            "AND (CAST(Business_support_budget AS SIGNED) <= :maxBudget)", nativeQuery = true)
    List<PolicyEntity> findByBusinessNameAndMaxBudget(
            @Param("businessName") String businessName,
            @Param("maxBudget") Long maxBudget);

    @Query(value = "SELECT * FROM support WHERE " +
            "CAST(Business_support_budget AS SIGNED) >= :minBudget", nativeQuery = true)
    List<PolicyEntity> findByMinBudget(
            @Param("minBudget") Long minBudget);

    @Query(value = "SELECT * FROM support WHERE " +
            "CAST(Business_support_budget AS SIGNED) <= :maxBudget", nativeQuery = true)
    List<PolicyEntity> findByMaxBudget(
            @Param("maxBudget") Long maxBudget);

    @Query(value = "SELECT * FROM support WHERE " +
            "(:organization IS NULL OR Business_support_organization_name LIKE %:organization%) " +
            "AND (CAST(Business_support_budget AS SIGNED) >= :minBudget)", nativeQuery = true)
    List<PolicyEntity> findByOrganizationAndMinBudget(
            @Param("organization") String organization,
            @Param("minBudget") Long minBudget);

    @Query(value = "SELECT * FROM support WHERE " +
            "(:organization IS NULL OR Business_support_organization_name LIKE %:organization%) " +
            "AND (CAST(Business_support_budget AS SIGNED) <= :maxBudget)", nativeQuery = true)
    List<PolicyEntity> findByOrganizationAndMaxBudget(
            @Param("organization") String organization,
            @Param("maxBudget") Long maxBudget);

}