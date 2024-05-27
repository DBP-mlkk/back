package com.example.dbpmkk.DTO;

import com.example.dbpmkk.Domain.Entity.PolicyEntity;

public class PolicyDTO {
    private int SupportNumber;
    private String SupportName;
    private String SupportOrganization;
    private String SupportClassification;
    private String SupportDetails;
    private String SupportBudget;

    public PolicyDTO(PolicyEntity policyEntity) {
        this.SupportNumber = policyEntity.getNumber();
        this.SupportName = policyEntity.getBusinessName();
        this.SupportOrganization = policyEntity.getBusinessSupportorganizationName();
        this.SupportClassification = policyEntity.getBusinessClassification();
        this.SupportDetails = policyEntity.getBusinessDetails();
        this.SupportBudget = policyEntity.getBusinessSupportBudget();
    }

    public int getNumber() {
        return SupportNumber;
    }

    public String getBusinessName() {
        return SupportName;
    }

    public String getBusinessSupportorganizationName() {
        return SupportOrganization;

    }

    public String getBusinessClassification() {
        return SupportClassification;
    }

    public String getBusinessDetails() {
        return SupportDetails;
    }

    public String getBusinessSupportBudget() {
        return SupportBudget;
    }
}



