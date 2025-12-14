package com.kodewala.polymorphism.runtime;

public class ToStringOverride {

	int num;

	ToStringOverride(int _num) {

		this.num = _num;

	}

	public String toString() {
		return "ObjectPrint { num = " + num + " }";
	}

	public static void main(String[] args) {
		ToStringOverride ts = new ToStringOverride(100);
		System.out.println(ts); // by default it uses toString() defined in Object class
		// We can overwrite it by provide the same method signature but different body
	}

}
