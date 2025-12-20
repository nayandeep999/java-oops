package com.kodewala.abstraction;

class University {
	private String uniName = "Stanford";

	// --- NON-STATIC INNER CLASS ---
	class Student {
		void intro() {
			// Can access 'uniName' directly via the hidden reference
			System.out.println("I am a student at " + uniName);
		}
	}

	// --- STATIC NESTED CLASS ---
	static class BuildingPlan {
		void printType() {
			// System.out.println(uniName); // ERROR! No link to a specific Uni
			System.out.println("Standard Library Design");
		}
	}
}

public class StaticVsNonStaticInnerClass {

	public static void main(String[] args) {

		// --- 1. Accessing the STATIC class ---
		// You don't need a University object!
		University.BuildingPlan plan = new University.BuildingPlan();
		plan.printType();

		// --- 2. Accessing the NON-STATIC class ---
		// Step A: Create the Outer object first
		University myUni = new University();

		// Step B: Use that object to create the inner object
		University.Student student = myUni.new Student();
		student.intro();
	}

}
