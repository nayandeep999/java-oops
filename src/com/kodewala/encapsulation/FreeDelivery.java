package com.kodewala.encapsulation;

public class FreeDelivery {
	private int distance;

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		if (distance > 0) {
			this.distance = distance;
			if (distance <= 2)
				System.out.println("You are eligible for free delivery");
			else
				System.out.println("You are not eligible for free delivery");
		}

	}

	public static void main(String[] args) {

		FreeDelivery fd = new FreeDelivery();
		fd.setDistance(12);
		System.out.println(fd.getDistance());

	}

}
