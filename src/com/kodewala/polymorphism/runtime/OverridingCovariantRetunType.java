package com.kodewala.polymorphism.runtime;

class User {
	String role = "USER";
}

class AdminUser extends User {
	String role = "ADMIN";

	void print() {
		System.out.println("print from admin user");
	}
}

class UserService {
	User getUser() {
		return new User(); //
	}
}

class AdminUserService extends UserService {
	@Override
	AdminUser getUser() {
		return new AdminUser();
	}
}

public class OverridingCovariantRetunType {

	public static void main(String[] args) {
		UserService service = new AdminUserService();
		User user = service.getUser(); // since service reference returns User type thats why compiler expects User
										// type
		System.out.println(user.getClass());
		System.out.println(user.role);

	}

}
