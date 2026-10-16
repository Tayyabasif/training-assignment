package com.acme.hr.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp){
        employees.add(emp);
        System.out.println("Employee created successfully");
    }

    public Employee findEmployeeById(String id){
        for(Employee employee:employees){
            if(employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    public void updateEmployeeDepartment(String id, String department){
        Employee employee = findEmployeeById(id);
        if(employee!=null){
            employee.setDepartment(department);
        }
    }

    public void updateEmployeeSalary(String id, double salary){
        Employee employee = findEmployeeById(id);
        if(employee!=null){
            employee.setSalary(salary);
        }
    }
}
