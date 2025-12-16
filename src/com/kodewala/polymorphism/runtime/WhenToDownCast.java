package com.kodewala.polymorphism.runtime;

class Employee {
	public void getUserId() {
		System.out.println("Employee.getUserId()");
	}
}

class Manager extends Employee {
	@Override
	public void getUserId() {
		System.out.println("Manager.getUserId()");
	}

	public void getSalaray() {
		System.out.println("Manager.getSalaray()");
	}
}

public class WhenToDownCast {

	public static void main(String[] args) {
		Employee mg = new Manager();

		// to call child specific methods we can just downcast to child reference
		((Manager) mg).getSalaray();

		// or just create a new object of child class with child reference
		Manager mg2 = new Manager();
		mg2.getSalaray();
	}

}
