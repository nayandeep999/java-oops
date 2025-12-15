package com.kodewala.polymorphism.runtime;

class CoreBanking {
	public void doFundTransfer() {
		System.out.println("CoreBanking.doFundTransfer()");
	}
}

class NetBanking extends CoreBanking {
	public void doFundTransfer() {
		System.out.println("NetBanking.doFundTransfer()");
	}
}

class UPI extends CoreBanking {
	@Override
	public void doFundTransfer() {
		System.out.println("UPI.doFundTransfer()");
	}
}

class CreditCard extends CoreBanking {
	@Override
	public void doFundTransfer() {
		System.out.println("CreditCard.doFundTransfer()");
	}
}
