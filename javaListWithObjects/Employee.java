package com.javaListWithObjects;

public class Employee implements Comparable<Employee> {
	
	// Fields (instance variables)
	private int employeeId; // Unique identifier for the employee
	private String employeeName; // Name of the employee
	private String employeeRole; // Role or job title of the employee
	private double employeeSalary; // Salary of the employee

	// Default constructor (no arguments)
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized constructor
	public Employee(int employeeId, String employeeName, String employeeRole, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
	}

	// Getter for employeeId
	public int getEmployeeId() {
		return employeeId;
	}

	// Setter for employeeId
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	// Getter for employeeName
	public String getEmployeeName() {
		return employeeName;
	}

	// Setter for employeeName
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	// Getter for employeeRole
	public String getEmployeeRole() {
		return employeeRole;
	}

	// Setter for employeeRole
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	// Getter for employeeSalary
	public double getEmployeeSalary() {
		return employeeSalary;
	}

	// Setter for employeeSalary
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	// Override toString() method to provide a string representation of the employee
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeRole="
				+ employeeRole + ", employeeSalary=" + employeeSalary + "]";
	}

	@Override
	public int compareTo(Employee e1) {
		// Compare employees based on their salaries
		if (this.employeeSalary == e1.employeeSalary) {
			return 0; // Salaries are equal
		} else if (this.employeeSalary < e1.employeeSalary) {
			return 1; // e1's salary is greater (ascending order)
		} else {
			return -1; // e2's salary is greater (ascending order)
		}
	}
}
