package com.kodewala.polymorphism.runtime;

class Person {

	private long netWorth;
	private String status;

	Person(long _netWorth) {
		this.netWorth = _netWorth;
		if (_netWorth >= 100000000) {
			this.status = "rich";
		} else {
			this.status = "poor";
		}
	}

	public boolean equals(Object obj) { // Overriding equals method to check if persons are equal
		Person p = (Person) obj; // based on their net worth
		return this.status.equals(p.status);
	}

}

public class EqualsBasedOnNetWorth {

	public static void main(String[] args) {

		Person p1 = new Person(100000000); // rich
		Person p2 = new Person(100000000); // rich
		Person p3 = new Person(1000000000); // rich
		Person p4 = new Person(1000000); // poor

		System.out.println(p1.equals(p2)); // true
		System.out.println(p1.equals(p2)); // true
		System.out.println(p1.equals(p4)); // false

	}

}
