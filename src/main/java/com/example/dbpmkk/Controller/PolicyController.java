package com.example.dbpmkk.Controller;

import com.example.dbpmkk.Service.PolicyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("policies")
@AllArgsConstructor
public class PolicyController {
    private PolicyService policyService;

    @RequestMapping("list")
    public void list(Model model){
        model.addAttribute("list", policyService.list());
    }
}
