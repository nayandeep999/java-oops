package com.kodewala.constructors.sdppractice;

enum Enum {
	INSTANCE;

	int i;

	public void show() {
		System.out.println(i);
	}
}

public class EnumType {

	public static void main(String[] args) {
		Enum e1 = Enum.INSTANCE;
		Enum e2 = Enum.INSTANCE;

		e1.i = 10;
		e2.i = 11;

		e1.show(); // same instance -> 11
	}

}
