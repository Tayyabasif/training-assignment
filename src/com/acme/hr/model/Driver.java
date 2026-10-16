package com.acme.hr.model;

public class Driver {

    public static void main(String[] args){

        EmployeeService service = new EmployeeService();

        //create new employee object and adds it to the "Employee" list
        Employee emp1 = new Employee("E1", "Tayyab", "Development", 1000);
        service.addEmployee(emp1);
        System.out.println();

        Employee emp2 = new Employee("E2", "John", "Development", 1000);
        service.addEmployee(emp2);
        System.out.println();

        //Print Employee Details
        Employee employee1 = service.findEmployeeById("E1");
        if(employee1!=null)
            System.out.println("Id: " + employee1.getId() + ", Name: " + employee1.getName() + ", Department: " + employee1.getDepartment() + ", Salary: " + employee1.getSalary());
        else
            System.out.println("Employee not found");

        Employee employee2 = service.findEmployeeById("E2");
        if(employee2!=null)
            System.out.println("Id: " + employee2.getId() + ", Name: " + employee2.getName() + ", Department: " + employee2.getDepartment() + ", Salary: " + employee2.getSalary());
        else
            System.out.println("Employee not found");

        //update department
        service.updateEmployeeDepartment("E1", "Testing");

        //Print Employee Details
        if(employee1!=null)
            System.out.println("Id: " + employee1.getId() + ", Name: " + employee1.getName() + ", Department: " + employee1.getDepartment() + ", Salary: " + employee1.getSalary());
        else
            System.out.println("Employee not found");

        System.out.println(Employee.getCreatedCount());
    }
}
