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
	}

}
