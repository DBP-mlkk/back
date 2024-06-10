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

        if (businessName != null && !businessName.isBlank()) {
            // 비즈니스 이름이 입력된 경우
            if (minBudget != null && maxBudget != null) {
                // 예산이 입력된 경우
                if (organization == null || organization.isBlank()) {
                    // 조직이 선택되지 않은 경우
                    policies = service.findByBusinessNameAndBudgetRange(businessName, minBudget, maxBudget);
                } else {
                    // 조직이 선택된 경우
                    policies = service.findByBusinessNameAndOrganizationAndBudgetRange(businessName, organization, minBudget, maxBudget);
                }
            } else if (organization != null && !organization.isBlank()) {
                // 조직만 입력된 경우
                policies = service.findByBusinessNameAndOrganization(businessName, organization);
            } else {
                // 파라미터가 없는 경우, 기본 동작 수행
                policies = service.findByBusinessName(businessName);
            }
        } else if (minBudget != null && maxBudget != null) {
            // 예산만 입력된 경우
            if (organization == null || organization.isBlank()) {
                // 조직이 선택되지 않은 경우
                policies = service.findByBudgetRange(minBudget, maxBudget);
            } else {
                // 조직이 선택된 경우
                policies = service.findByOrganizationAndBudgetRange(organization, minBudget, maxBudget);
            }
        } else if (organization != null && !organization.isBlank()) {
            // 조직만 입력된 경우
            policies = service.findByOrganization(organization);
        } else {
            // 파라미터가 없는 경우, 기본 동작 수행
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

