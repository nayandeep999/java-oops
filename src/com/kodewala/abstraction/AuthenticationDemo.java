package com.kodewala.abstraction;

abstract class AuthenticationProvider {
	abstract void authenticate(String user, String pass);
}

class GoogleAuth extends AuthenticationProvider {
	@Override
	void authenticate(String user, String pass) {
		System.out.println("GoogleAuth.authenticate()");

	}
}

class EmailAuth extends AuthenticationProvider {
	@Override
	void authenticate(String user, String pass) {
		System.out.println("EmailAuth.authenticate()");

	}
}

public class AuthenticationDemo {

	public static void main(String[] args) {
		AuthenticationProvider ap = new GoogleAuth();
		ap.authenticate("hello", "bye");

		ap = new EmailAuth();
		ap.authenticate(null, null);
	}

}
