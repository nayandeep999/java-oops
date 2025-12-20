package com.kodewala.inheritance;

import com.kodewala.polymorphism.HowToHaveMultiplePublicClasses;
import com.kodewala.polymorphism.HowToHaveMultiplePublicClasses.CoreBanking;

public class ProcessPayment {

	public static void doPayment(CoreBanking cb) {
		cb.doFundTransfer();
	}

	public static void main(String[] args) {
		HowToHaveMultiplePublicClasses h = new HowToHaveMultiplePublicClasses();
		HowToHaveMultiplePublicClasses.CoreBanking upi = h.new UPI();
		doPayment(upi);

		// upi.upiSpecificMethod() -> this method does not exist on CoreBanking
		// reference
		HowToHaveMultiplePublicClasses.UPI upix = h.new UPI();
		upix.upiSpecificMethod(); // now you can call this because this exists on UPI reference

		// DOWNCASTING - Using the SAME object 'upi'
		// This (UPI) syntax is the "Cast" operator. No 'new' keyword!
		HowToHaveMultiplePublicClasses.UPI upiX = (HowToHaveMultiplePublicClasses.UPI) upi;
		upiX.upiSpecificMethod();

	}

}
