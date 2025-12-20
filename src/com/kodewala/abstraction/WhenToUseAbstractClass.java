package com.kodewala.abstraction;

//Root Class
abstract class Employee { // Since we don't want this object to created we use abstract keyword
	// just providing a structure to related class
	private String name;
	private String employeeId;
	private String department;

	public Employee(String name, String employeeId, String department) {
		this.name = name;
		this.employeeId = employeeId;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getDepartment() {
		return department;
	}

	public abstract void printEmployeeDetails();
}

//Intermediate Abstract Class
abstract class FullTimeEmployee extends Employee {
	private int annualSalary;

	public FullTimeEmployee(String name, String employeeId, String department, int annualSalary) {
		super(name, employeeId, department);
		this.annualSalary = annualSalary;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public String getStatus() {
		return "Full Time";
	}
}

//Concrete Class
class Managerxx extends FullTimeEmployee {
	private double bonus; // Changed to double
	private int teamSize;
	private static String role = "Manager";

	public Managerxx(String name, String employeeId, String department, int annualSalary, double bonus, int teamSize) {
		super(name, employeeId, department, annualSalary);
		this.bonus = bonus;
		this.teamSize = teamSize;
	}

	@Override
	public void printEmployeeDetails() {
		System.out.printf(
				"Name: %s | ID: %s | Status: %s | Dept: %s | Role: %s | Salary: %d | Bonus: %.2f | Team: %d%n",
				getName(), getEmployeeId(), getStatus(), getDepartment(), role, getAnnualSalary(), bonus, teamSize);
	}
}

//Concrete Class: Contractor (inherits directly from Employee)
class Contractor extends Employee {
	private double hourlyRate;
	private int contractDurationMonths;
	private String role;

	public Contractor(String name, String employeeId, String department, String role, double hourlyRate,
			int contractDurationMonths) {
		super(name, employeeId, department);
		this.role = role;
		this.hourlyRate = hourlyRate;
		this.contractDurationMonths = contractDurationMonths;
	}

	public String getStatus() {
		return "Contractor";
	}

	@Override
	public void printEmployeeDetails() {
		System.out.printf("Name: %s | ID: %s | Status: %s | Dept: %s | Role: %s | Rate: %.2f | Duration: %d months%n",
				getName(), getEmployeeId(), getStatus(), getDepartment(), role, hourlyRate, contractDurationMonths);
	}
}

public class WhenToUseAbstractClass {

	public static void main(String[] args) {
		// Polymorphism in action: Both objects are stored in an 'Employee' array
		Employee[] employees = new Employee[2];

		employees[0] = new Managerxx("Nayandeep", "M001", "Tech", 2000000, 200000.0, 20);
		employees[1] = new Contractor("Rahul", "C005", "Design", "Designer", 50.0, 6);

		for (Employee emp : employees) {
			emp.printEmployeeDetails();
			System.out.println(); // Spacing
		}
	}

}
