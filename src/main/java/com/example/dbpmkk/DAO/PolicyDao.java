package com.example.dbpmkk.DAO;

import com.example.dbpmkk.Domain.PolicyEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PolicyDao {
    public List<PolicyEntity> list() {
        List<PolicyEntity> list = new ArrayList<>();
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/dbp_db", "root","mkk");
            ResultSet rs = conn.prepareStatement("SELECT * FROM support").executeQuery();
            while(rs.next()){
                int idx = 1;
                PolicyEntity policies = new PolicyEntity(rs.getInt(idx++), rs.getString(idx++), rs.getString(idx++),rs.getString(idx++),rs.getString(idx++),rs.getString(idx++));
                list.add(policies);
            }
        }
        catch (SQLException | ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return list;
    }
}
