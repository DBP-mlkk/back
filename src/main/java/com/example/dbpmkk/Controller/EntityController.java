package com.example.dbpmkk.Controller;

import com.example.dbpmkk.Domain.Repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/entities")
public class EntityController {
    @Autowired
    private PolicyRepository policyRepository;

    @GetMapping("/city/{global_City}")
    public List<Global> getEntitiesByGlobalCity(@PathVariable String global_City) {
        return policyRepository.findByglobalCity(global_City);
    }
}
