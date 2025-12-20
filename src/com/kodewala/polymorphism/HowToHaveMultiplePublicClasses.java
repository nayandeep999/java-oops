package com.kodewala.polymorphism;

public class HowToHaveMultiplePublicClasses { // define nested public classes

	public class CoreBanking {
		public void doFundTransfer() {
			System.out.println("CoreBanking.doFundTransfer()");
		}
	}

	public class NetBanking extends CoreBanking {
		public void doFundTransfer() {
			System.out.println("NetBanking.doFundTransfer()");
		}
	}

	public class UPI extends CoreBanking {
		@Override
		public void doFundTransfer() {
			System.out.println("UPI.doFundTransfer()");
		}

		public void upiSpecificMethod() {
			System.out.println("UPI.upiSpecificMethod()");
		}
	}

	public class CreditCard extends CoreBanking {
		@Override
		public void doFundTransfer() {
			System.out.println("CreditCard.doFundTransfer()");
		}
	}

}
