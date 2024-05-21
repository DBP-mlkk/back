package com.example.dbpmkk.Service;

import com.example.dbpmkk.Entity.Global;
import com.example.dbpmkk.Repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService {
    @Autowired
    private EntityRepository entityRepository;

    public List<Global> getEntityByglobalCityThan(String global_City){
        return entityRepository.findByglobalCity(global_City);
    }
}
