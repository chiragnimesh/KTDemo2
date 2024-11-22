package com.example.demo.classes;
import java.util.*;
import java.util.stream.Collectors;

public class Employee {

	    private String name;
	    private String department;
	    private double salary;

	    public Employee(String name, String department, double salary) {
	        this.name = name;
	        this.department = department;
	        this.salary = salary;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    // Override toString for better display
	    @Override
	    public String toString() {
	        return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + "}";
	    }

	  
	}



class EmployeeGrouping {

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        return employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));
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

        // Group employees by department
        Map<String, List<Employee>> groupedByDepartment = groupByDepartment(employees);

        // Print the result
        groupedByDepartment.forEach((department, empList) -> {
            System.out.println("Department: " + department);
            empList.forEach(System.out::println);
        });
    }
}


	

