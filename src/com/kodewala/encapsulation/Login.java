package com.kodewala.encapsulation;

class User {
	private String userId;
	private String pass;
	private String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9]).+$";
	private boolean isPassStrong;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
		if (pass.matches(regex)) {
			isPassStrong = true;
		}

	}

	public void checkPassStrong() {
		if (isPassStrong)
			System.out.println("Your password is strong");
		else
			System.out.println("Your password is not strong");
	}

}

public class Login {

	public static void main(String[] args) {
		User u1 = new User();
		u1.setUserId("nayansen");
		u1.setPass("Allowme@1234554321");

		System.out.println("Your username is: " + u1.getUserId() + "\n" + "Your password is: " + u1.getPass());

		u1.checkPassStrong();
	}

}
