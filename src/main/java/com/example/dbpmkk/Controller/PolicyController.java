package com.example.dbpmkk.Controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.dbpmkk.Domain.PolicyEntity;
import com.example.dbpmkk.Service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class PolicyController {
    private final PolicyService service;

    @Autowired
    public PolicyController(PolicyService service) {
        this.service = service;
    }

    @GetMapping("/entities")
    public List<PolicyEntity> getAllEntities() {
        return service.findAll();
    }

    @GetMapping("/")
    public String index(Model model) {
        List<PolicyEntity> policies = service.findAll();
        model.addAttribute("policies", policies);
        return "main";
    }

    @GetMapping("/searchByOrganization")
    public String getPoliciesByOrganizations(@RequestParam("organization") String organization, Model model) {
        List<PolicyEntity> policies = service.findByOrganization(organization);
        model.addAttribute("policies", policies);
        return "subpage";
    }

    @GetMapping("/search")
    public String getPoliciesByOrganizationAndBudgetRange(
            @RequestParam(name = "businessName", required = false) String businessName,
            @RequestParam(name = "organization", required = false) String organization,
            @RequestParam(name = "minBudget", required = false) Long minBudget,
            @RequestParam(name = "maxBudget", required = false) Long maxBudget,
            Model model) {

        List<PolicyEntity> policies;

        boolean hasBusinessName = businessName != null && !businessName.isBlank();
        boolean hasOrganization = organization != null && !organization.isBlank();
        boolean hasMinBudget = minBudget != null;
        boolean hasMaxBudget = maxBudget != null;

        if (hasBusinessName) {
            if (hasMinBudget && hasMaxBudget) {
                if (hasOrganization) {
                    policies = service.findByBusinessNameAndOrganizationAndBudgetRange(businessName, organization, minBudget, maxBudget);
                } else {
                    policies = service.findByBusinessNameAndBudgetRange(businessName, minBudget, maxBudget);
                }
            } else if (hasMinBudget) policies = service.findByBusinessNameAndMinBudget(businessName, minBudget);
            else if (hasMaxBudget) {
                policies = service.findByBusinessNameAndMaxBudget(businessName, maxBudget);
            } else if (hasOrganization) {
                policies = service.findByBusinessNameAndOrganization(businessName, organization);
            } else {
                policies = service.findByBusinessName(businessName);
            }
        } else if (hasMinBudget && hasMaxBudget) {
            if (hasOrganization) {
                policies = service.findByOrganizationAndBudgetRange(organization, minBudget, maxBudget);
            } else {
                policies = service.findByBudgetRange(minBudget, maxBudget);
            }
        } else if (hasMinBudget) {
            if (hasOrganization) {
                policies = service.findByOrganizationAndMinBudget(organization, minBudget);
            } else {
                policies = service.findByMinBudget(minBudget);
            }
        } else if (hasMaxBudget) {
            if (hasOrganization) {
                policies = service.findByOrganizationAndMaxBudget(organization, maxBudget);
            } else {
                policies = service.findByMaxBudget(maxBudget);
            }
        } else if (hasOrganization) {
            policies = service.findByOrganization(organization);
        } else {
            policies = service.findAll();
        }

        model.addAttribute("policies", policies);
        return "subpage";
    }
    @GetMapping("/searchbud")
    public String getPoliciesByBudgetRange(Model model,
            @RequestParam("minBudget") Long minBudget,
            @RequestParam("maxBudget") Long maxBudget) {
        List<PolicyEntity> policies = service.findByBudgetRange(minBudget,maxBudget);
        model.addAttribute("policies", policies);
        return "subpage";
    }


}

