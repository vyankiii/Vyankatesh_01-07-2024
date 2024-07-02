package com.javaListWithComaparaorObjects;

import java.util.Comparator;

public class SortEmployeeBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// Compare employees based on their salaries
		if (e1.getEmployeeSalary() == e2.getEmployeeSalary()) {
			return 0; // Salaries are equal
		} else if (e1.getEmployeeSalary() < e2.getEmployeeSalary()) {
			return 1; // e1's salary is greater (ascending order)
		} else {
			return -1; // e2's salary is greater (ascending order)
		}
	}
}
