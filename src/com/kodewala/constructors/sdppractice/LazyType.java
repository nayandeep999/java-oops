package com.kodewala.constructors.sdppractice;

class Lazy {

	private Lazy() {
		System.out.println("Instance Created");
	}

	private static Lazy lz;

	public static Lazy getInstance() {
		if (lz == null) {
			lz = new Lazy();
			return lz;
		}
		return lz;
	}
}

public class LazyType {

	public static void main(String[] args) {
		Lazy lz1 = Lazy.getInstance();
		Lazy lz2 = Lazy.getInstance();
	}

}
