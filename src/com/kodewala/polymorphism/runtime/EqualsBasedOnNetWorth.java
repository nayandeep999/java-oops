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

	public String getStatus() {
		return status;
	}

	public boolean equals(Object obj) { // Overriding equals method to check if persons are equal
		Person p = (Person) obj; // based on their net worth
		return this.status.equals(p.status);
		// return this.netWorth == p.netWorth;
	}

}

class StockBrokers extends Person { // extended a class that overridden equals method

	public StockBrokers(long _netWorth) {
		super(_netWorth);
	}

}

public class EqualsBasedOnNetWorth {

	public static void main(String[] args) {

		Person p1 = new Person(100000000); // rich
		Person p2 = new Person(100000000); // rich
		Person p3 = new Person(1000000000); // rich
		Person p4 = new Person(1000000); // poor

		Person p5 = new StockBrokers(1000); // poor

		System.out.println(p1.equals(p2)); // true
		System.out.println(p1.equals(p2)); // true
		System.out.println(p1.equals(p4)); // false
		System.out.println(p5.equals(p1)); // false //p5.equals would call the equal method of the parent class

		System.out.println(p5.getStatus()); // poor

	}

}
