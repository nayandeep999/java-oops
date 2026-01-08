package com.kodewala.protectedV1;

public class Child extends Parent {

	public Child() {
		this.protectedMethod();
		System.out.println("protectedMethod() called from Child constructor");
	}

	public static void main(String[] args) {
		Parent p = new Child();
		p.protectedMethod();

		Child c = new Child();
		c.protectedMethod(); // Since we are inside child scope we can access this method using child
		// reference as well

	}

}
