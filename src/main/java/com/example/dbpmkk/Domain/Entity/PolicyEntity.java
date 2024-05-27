package com.example.dbpmkk.Domain.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class PolicyEntity {
    private int BusinessNumber;

    private String BusinessName;

    private String BusinessSupportorganizationName;

    private String BusinessClassification;

    private String BusinessDetails;

    private String BusinessSupportBudget;


//
//    public int getNumber() {
//        return BusinessNumber;
//    }
//
//    public String getBusinessName() {
//        return BusinessName;
//    }
//
//    public String getBusinessSupportorganizationName() {
//        return BusinessSupportorganizationName;
//
//    }
//
//    public String getBusinessClassification() {
//        return BusinessClassification;
//    }
//
//    public String getBusinessDetails() {
//        return BusinessDetails;
//    }
//
//    public String getBusinessSupportBudget() {
//        return BusinessSupportBudget;
//    }
}