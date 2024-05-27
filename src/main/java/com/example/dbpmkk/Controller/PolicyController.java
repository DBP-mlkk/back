package com.example.dbpmkk.Controller;

import ch.qos.logback.core.model.Model;
import com.example.dbpmkk.Domain.Entity.PolicyEntity;
import com.example.dbpmkk.Service.PolicyService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;


@Controller
public class PolicyController {
    @Autowired
    private PolicyService policyService;

    @GetMapping("/supports")
    public String getALlPolicies(Model model) {
        List<PolicyEntity> policies = policyService.getAllPolicies();
        model.addAttribute("policies",policies);
        return "index";
    }


}
