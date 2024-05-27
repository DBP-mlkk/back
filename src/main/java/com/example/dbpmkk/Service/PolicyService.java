package com.example.dbpmkk.Service;

import com.example.dbpmkk.DAO.PolicyDao;
import com.example.dbpmkk.Domain.PolicyEntity;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @Setter
public class PolicyService {
    private PolicyDao policyDao;

    public List<PolicyEntity> list() {
        return policyDao.list();

    }
}
