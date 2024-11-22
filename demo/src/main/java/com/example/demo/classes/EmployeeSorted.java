package com.example.demo.classes;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSorted {

    public static List<Employee> sortBySalaryDescending(List<Employee> employees) {
        return employees.stream()
                        .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())) // Sort in descending order
                        .collect(Collectors.toList());
    }

    public void addEmployee() {
        // Create a list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 50000),
            new Employee("Bob", "IT", 60000),
            new Employee("Charlie", "Finance", 55000),
            new Employee("Diana", "IT", 65000),
            new Employee("Eve", "HR", 52000)
        );

        // Sort employees by salary in descending order
        List<Employee> sortedEmployees = sortBySalaryDescending(employees);

        // Print the sorted list
        sortedEmployees.forEach(System.out::println);
    }
}
