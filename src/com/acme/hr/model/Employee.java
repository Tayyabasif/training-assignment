package com.acme.hr.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    static int createdCount;

   private final String id;
   private final String name;
   private String department;
   private double salary;

    public Employee(String id, String name, String department, double salary) {

        if(id == null || id.isBlank())
            throw new IllegalArgumentException("Id cannot be blank or null");

        if(name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be blank or null");

        if(department == null || department.isBlank())
            throw new IllegalArgumentException("Department cannot be blank or null");

        if(salary<0)
            throw new IllegalArgumentException("Salary cannot be negative");

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;

        createdCount++;
    }



    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0)
            throw new IllegalArgumentException("Salary cannot be negative");

        this.salary = salary;
    }

    public static int getCreatedCount() {
        return createdCount;
    }
}