package com.skilllync.empapp;

import java.sql.Connection;

import java.sql.PreparedStatement;

public class EmployeeDaoImpl implements EmployeeDaoIntrf{
    Connection con;
    @Override
    public void createEmployee(Employee emp) {
        // TODO Auto-generated method stub
        con = DBconnection.createDBConnection();
        String query = "insert into employee values(?,?,?,?)";
        try{
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1,emp.getId());
            pstmt.setString(2,emp.getName());
            pstmt.setDouble(3, emp.getSalary());
            pstmt.setInt(4, emp.getAge());

            int x = pstmt.executeUpdate();
            if(x>0){
                System.out.println("Employee Inserted Successfully !!!");
            }
            else{
                System.out.println("Not Inserted successfully ");
            }

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
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
