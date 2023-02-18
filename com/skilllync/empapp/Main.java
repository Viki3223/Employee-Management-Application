package com.skilllync.empapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeDaoImpl dao = new EmployeeDaoImpl();
        System.out.println("Welcome to employee management System");

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Add Employee\n" +
                    "2. Show All Employee\n" +
                    "3. show Employee based on id\n" +
                    "4. Update the employee\n" +
                    "5. Delete the employee\n" +
                    "6. Exit");
            System.out.print("Enter choise: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                Employee emp = new Employee();
                System.out.println("Enter Id :");
                int id =sc.nextInt();
                System.out.println("Enter name : ");
                String name = sc.next();
                System.out.println("Enter Salary : ");
                double salary = sc.nextDouble();
                System.out.println("Enter age : ");
                int age = sc.nextInt();
                emp.setId(id);
                emp.setName(name);
                emp.setSalary(salary);
                emp.setAge(age);
                dao.createEmployee(emp);
                
                emp.setId(id);
                emp.setName(name);
                emp.setSalary(salary);
                emp.setAge(age);
                
                    dao.createEmployee(emp);
                    break;

                case 2:
                    dao.showAllEmployee();
                    break;

                case 3: 
                System.out.println("Enter the employe id to show details");
                int empid = sc.nextInt();
                dao.showEmployeeBasedOnId(empid);
                case 6:
                    System.out.println("Thanku for using our Application !!!");
                    System.exit(0);
                default:
                    System.out.println("Enter valid choise ");
                    break;
            }
        } while (true);
    }
}
