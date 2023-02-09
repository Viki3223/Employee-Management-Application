package com.skilllync.empapp;

import com.mysql.jdbc.Connection;

public class EmployeeDaoImpl implements EmployeeDaoIntrf{
    java.sql.Connection con;
    @Override
    public void createEmployee(Employee emp) {
        // TODO Auto-generated method stub
        con = DBconnection.createDBConnection();
        String query = "insert into employee values(?,?,?,?)";
        
    }

    @Override
    public void showAllEmployee() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void showEmployeeBasedOnId() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateEmployee(int id, String name) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteEmployee(int id) {
        // TODO Auto-generated method stub
        
    }
    
}
