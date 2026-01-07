package com.kodewala.protectedV2;

public class Driver {
	public static void main(String[] args) {
		GrandChild gc = new GrandChild();
		// gc.protectedMethod(); // The method protectedMethod() from the type Parent is
		// not visible
		// Protected = inheritance-only access OR same package
		// since protectedMethod() is present inside protectedV1 package
		// And you are trying to call this inside protectedV2 package
		// It does not works
		// just overwrite protectedMethod() and inside body call super.protectedMethod()
		// Done now you can call

		gc.protectedMethod();

		// Protected is like default PLUS subclass access across packages
	}
}
