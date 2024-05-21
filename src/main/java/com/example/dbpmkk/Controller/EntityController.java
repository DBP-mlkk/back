package com.example.dbpmkk.Controller;

import com.example.dbpmkk.Entity.Global;
import com.example.dbpmkk.Repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/entities")
public class EntityController {
    @Autowired
    private EntityRepository entityRepository;

    @GetMapping("/city/{global_City}")
    public List<Global> getEntitiesByGlobalCity(@PathVariable String global_City) {
        return entityRepository.findByglobalCity(global_City);
    }
}
