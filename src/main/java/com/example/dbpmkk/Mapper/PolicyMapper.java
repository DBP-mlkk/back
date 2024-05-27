package com.example.dbpmkk.Mapper;


import com.example.dbpmkk.Domain.Entity.PolicyEntity;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public class PolicyMapper {
    List<PolicyEntity> selectAllPolicy();
}
