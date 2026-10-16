package com.toucan.features;

import java.util.Arrays;
import java.util.List;

public class EmployeeFilter {

    public static void main(String[] args){

        List<Employee> employees = Arrays.asList(
                new Employee("Tayyab", "development", 65000, true)
                ,new Employee("John", "development", 65000, false)
                ,new Employee("Spongebob", "HR", 50000, true)
                ,new Employee("Harry", "development", 65000, true));

        employees.stream()
                .filter(e -> e.salary()>60000 && e.isActive())
                .map(Employee::name)
                .sorted()
                .forEach(System.out::println);
    }
}
