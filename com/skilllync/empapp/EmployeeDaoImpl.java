package com.skilllync.empapp;

import java.sql.Statement;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
        con = DBconnection.createDBConnection();
        String query = "Seletct * from employee";
        System.out.println("Employee Details :");
        System.out.format("%s\t%s\t%s\t%s\n","ID","Name","Salary","age");
        System.out.println("--------------------");
        
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while(result.next()){
                System.out.format("%d \n%s \n%f \n%d \n",result.getInt(1),
                                            result.getString(2),
                                            result.getDouble(3),
                                            result.getInt(4));
                                            System.out.println("-------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void showEmployeeBasedOnId(int id) {
        // TODO Auto-generated method stub
        con = DBconnection.createDBConnection();
        String querry = "Select * from employee where id = "+id;
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(querry);
            while(result.next()){
                System.out.format("%d \n%s \n%f \n%d \n",result.getInt(1),
                                            result.getString(2),
                                            result.getDouble(3),
                                            result.getInt(4));
                                            System.out.println("-------------------");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        
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
