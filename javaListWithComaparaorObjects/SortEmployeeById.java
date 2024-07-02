package com.javaListWithComaparaorObjects;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// Compare employees based on their IDs
		if (e1.getEmployeeId() == e2.getEmployeeId()) {
			return 0; // IDs are equal
		} else if (e1.getEmployeeId() < e2.getEmployeeId()) {
			return 1; // e1's ID is greater (ascending order)
		} else {
			return -1; // e2's ID is greater (ascending order)
		}
	}
}