package com.toucan.stream.names;

import java.util.Arrays;
import java.util.List;

public class NamesDriver {

    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee("Tayyab", "Asif", "development"),
                new Employee("John", "Doe", "development"));

        List<String> nameList = employees.stream().map(employee -> employee.getFullName().toUpperCase()).toList();

        nameList.stream().sorted().forEach(System.out::println);
    }
}
