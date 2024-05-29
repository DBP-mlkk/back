package com.example.dbpmkk.Mapper;

import com.example.dbpmkk.Domain.PolicyEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PolicyMapper {
    List<PolicyEntity> selectAllPolicies();
}
