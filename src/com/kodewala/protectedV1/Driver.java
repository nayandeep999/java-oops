package com.kodewala.protectedV1;

public class Driver {

	public static void main(String[] args) {
		Child c = new Child();
		c.protectedMethod();

		Parent p = new Parent();
		p.protectedMethod(); // we can access protected method via parent object as well
	}
}
