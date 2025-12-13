package com.kodewala.inheritance;

class Class1 {
	static {
		System.out.println("static block from Class1");
	}
	static int i1 = 1;

	{
		String iib = "IIBfromClass1";
	}
	String s1 = "Class1";

	Class1() {
		System.out.println("Constructor of Class1");
	}
}

class Class2 extends Class1 {
	String s2 = "Class2";

	Class2() {
		System.out.println("Constructor of Class2");
	}
}

class Class3 extends Class2 {
	String s3 = "Class3";

	Class3() {
		System.out.println("Constructor of Class3");
	}
}

class Class4 extends Class3 {
	String s4 = "Class4";

	Class4() {
		System.out.println("Constructor of Class4");
	}
}

class Class5 extends Class4 {
	String s5 = "Class5";

	Class5() {
		System.out.println("Constructor of Class5");
	}
}

public class InheritanceObjTest {

	public static void main(String[] args) {
		Class5 cl5 = new Class5(); // first static var will initiate before any cons & it does not
		// belongs to the object
		// Only fields declared at class level become part of the object and are
		// inherited.
		// Variables declared inside IIB or constructor are local and die immediately.
	}
}