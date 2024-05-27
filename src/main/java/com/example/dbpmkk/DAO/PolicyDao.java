package com.example.dbpmkk.DAO;

import com.example.dbpmkk.Domain.PolicyEntity;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PolicyDao {
    public List<PolicyEntity> list() {
        List<PolicyEntity> list = new ArrayList<>();
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/dbp_db", "root","mkk");
            ResultSet rs = conn.prepareStatement("SELECT * FROM support").executeQuery();
            while (rs.next()) {
                PolicyEntity policies = new PolicyEntity(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                list.add(policies);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
