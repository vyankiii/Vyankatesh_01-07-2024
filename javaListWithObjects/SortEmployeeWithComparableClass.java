package com.javaListWithObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployeeWithComparableClass {

	public static void main(String[] args) {

		List<Employee> values = new ArrayList<Employee>();

		// Add Employee objects to the list
		values.add(new Employee(1, "Raj", "Java Developer", 4476.53));
		values.add(new Employee(5, "Mahesh", "C#.Net Developer", 73236.47));
		values.add(new Employee(6, "Suraj", "Java Developer", 234876.35));
		values.add(new Employee(3, "Kiran", "PHP Developer", 23656.423));
		values.add(new Employee(2, "Jayesh", "PHP Developer", 662376.425));
		values.add(new Employee(456, "Ram", "C#.Net Developer", 48656.66));

		// Uncomment the section below to sort employees by ID or name
		/*
		 * System.out.println("----------------sorted employee by id---------------");
		 * Collections.sort(values); for (Employee employee : values) {
		 * System.out.println(employee); }
		 * 
		 * System.out.println("----------------sorted employee by name---------------");
		 * Collections.sort(values); for (Employee employee : values) {
		 * System.out.println(employee); }
		 */

		// Sort employees by salary (using Comparable interface)
		System.out.println("----------------sorted employee by salary---------------");
		Collections.sort(values);
		for (Employee employee : values) {
			System.out.println(employee);
		}
	}
}
