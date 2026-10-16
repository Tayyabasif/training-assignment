package com.toucan.stream.salary;

import com.toucan.stream.hr.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HighestSalary {

    public static void main(String[] args){

        List<Employee> employees = Arrays.asList(
                new Employee("Tayyab","IT",70000),
                new Employee("John","IT",65000),
                new Employee("Spongebob","Finance",1000),
                new Employee("Joe","Finance",1000));

        List<Employee> sortedEmployees = employees.stream().sorted((x,  y) -> {
            return x.name().compareTo(y.name());
        }).collect(Collectors.toList());

        sortedEmployees.stream().sorted((a,b) -> (int) (b.salary() - a.salary())).limit(3).forEach(System.out::println);
    }
}
