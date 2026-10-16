package com.toucan.stream.hr;

import java.util.Arrays;
import java.util.List;

public class EmployeeDriver {

    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee("Tayyab","IT",70000),
                new Employee("John","IT",65000),
                new Employee("Spongebob","Finance",1000));

        employees.stream()
                .filter(e -> e.salary()>60000)
                .forEach(e -> System.out.println("Name: " + e.name() + ", Salary: " + e.salary()));
    }
}
