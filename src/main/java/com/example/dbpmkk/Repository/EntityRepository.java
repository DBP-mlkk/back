package com.example.dbpmkk.Repository;

import com.example.dbpmkk.Entity.Global;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntityRepository extends JpaRepository<Global, Long> {
    List<Global> findByglobalCity(String global_City);
}
