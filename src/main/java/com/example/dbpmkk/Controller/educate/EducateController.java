package com.example.dbpmkk.Controller.educate;

import com.example.dbpmkk.Domain.educate.EducateEntity;
import com.example.dbpmkk.Service.educate.EducateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class EducateController {
    private final EducateService educateService;

    @Autowired
    public EducateController(EducateService educateService) {
        this.educateService = educateService;
    }

    @GetMapping("/courses")
    public String courses(Model model) {
        List<EducateEntity> courses = educateService.getAllCourses();
        model.addAttribute("courses", courses);
        return "policy/subpage2";
    }
}