package com.example.dbpmkk.Controller;

import com.example.dbpmkk.Domain.PolicyEntity;
import com.example.dbpmkk.Service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/entities")
public class PolicyController {
    private final PolicyService service;

    @Autowired
    public PolicyController(PolicyService service) {
        this.service = service;
    }

    @GetMapping
    public List<PolicyEntity> getAllEntities() {
        return service.findAll();
    }

    @GetMapping("/search")
    public List<PolicyEntity> getPoliciesByOrganization(@RequestParam String organization) {
        return service.findByOrganizationName(organization);
    }//
}


