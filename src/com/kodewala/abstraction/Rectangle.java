package com.kodewala.abstraction;

abstract class Shape {
	public abstract int calculateArea(int x, int y);
}

public class Rectangle extends Shape {

	@Override
	public int calculateArea(int x, int y) {
		return x * y;
	}

	public static void main(String[] args) {
		Shape rc = new Rectangle();
		int area = rc.calculateArea(10, 10);
		System.out.println(area);
	}

}
