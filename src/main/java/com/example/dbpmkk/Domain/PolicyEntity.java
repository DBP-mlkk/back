package com.example.dbpmkk.Domain;

import jakarta.persistence.*;


@Entity
@Table(name="support")
public class PolicyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Business_number")
    private int BusinessNumber;

    @Column(name = "Business_classification")
    private String BusinessClassification;

    @Column(name = "Business_details")
    private String BusinessDetails;

    @Column(name = "Business_name")
    private String BusinessName;

    @Column(name = "Business_support_budget")
    private String BusinessSupportBudget;

    @Column(name = "Business_support_organization_name")
    private String BusinessSupportOrganizationName;



    public int getNumber() {
        return BusinessNumber;
    }

    public String getBusinessName() {
        return BusinessName;
    }

    public String findByBusinessSupportOrganizationName() {
        return BusinessSupportOrganizationName;
    }

    public String getBusinessClassification() {
        return BusinessClassification;
    }

    public String getBusinessDetails() {
        return BusinessDetails;
    }

    public String getBusinessSupportBudget() {
        return BusinessSupportBudget;
    }
}