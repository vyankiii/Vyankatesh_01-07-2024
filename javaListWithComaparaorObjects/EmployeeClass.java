package com.javaListWithComaparaorObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeClass {

	public static void main(String[] args) {

		List<Employee> values = new ArrayList<Employee>();

		// Add Employee objects to the list
		values.add(new Employee(1, "Satish", "Java Developer", 87689.09));
		values.add(new Employee(2, "Harish", "C#.Net Developer", 53446.47));
		values.add(new Employee(3, "Dinesh", "Java Developer", 45876.45));
		values.add(new Employee(4, "Ganesh", "C#.Net Developer", 55656.57));
		values.add(new Employee(5, "Kamal", "PHP Developer", 968376.42));
		values.add(new Employee(6, "Ram", "C#.Net Developer", 53646.63));

		// Sort employees by ID
		System.out.println("----------------sorted employee by id---------------");
		Collections.sort(values, new SortEmployeeById());
		for (Employee employee : values) {
			System.out.println(employee);
		}

		// Sort employees by name
		System.out.println("----------------sorted employee by name---------------");
		Collections.sort(values, new SortEmployeeByName());
		for (Employee employee : values) {
			System.out.println(employee);
		}

		// Sort employees by role
		System.out.println("----------------sorted employee by role---------------");
		Collections.sort(values, new SortEmployeeByRole());
		for (Employee employee : values) {
			System.out.println(employee);
		}

		// Sort employees by salary
		System.out.println("----------------sorted employee by salary---------------");
		Collections.sort(values, new SortEmployeeBySalary());
		for (Employee employee : values) {
			System.out.println(employee);
		}
	}
}
