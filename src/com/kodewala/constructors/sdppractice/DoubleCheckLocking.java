package com.kodewala.constructors.sdppractice;

class DCL {

	private DCL() {
		System.out.println("Instance Created");
	}

	private static DCL dcl;

	public static DCL getInstance() {
		if (dcl == null) {
			synchronized (DCL.class) {

				if (dcl == null) {

					dcl = new DCL();
					return dcl;
				}

			}
		}

		return dcl;
	}

}

public class DoubleCheckLocking {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> DCL.getInstance());
		Thread t2 = new Thread(() -> DCL.getInstance());

		t1.start();
		t2.start();
	}

}
