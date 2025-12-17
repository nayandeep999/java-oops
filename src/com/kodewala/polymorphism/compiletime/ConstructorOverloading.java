package com.kodewala.polymorphism.compiletime;

class ChooseAMajor {
	private String sub1;
	private String sub2;

	ChooseAMajor(String _sub1) {

		this.sub1 = _sub1;

	}

	ChooseAMajor(String _sub1, String _sub2) {

		this.sub1 = _sub1;
		this.sub2 = _sub2;

	}

	public String getSub1() {
		return sub1;
	}

	public String getSub2() {
		return sub2;
	}

}

public class ConstructorOverloading {

	public static void main(String[] args) {
		System.out.println("You can chosse 2 majors but you have to choose atleast one");
		ChooseAMajor cam = new ChooseAMajor("CS");

		// Depending upon the number of subjects you pass
		// compiler will decide which constructor to call
		// actual call happens during runtime
	}

}
