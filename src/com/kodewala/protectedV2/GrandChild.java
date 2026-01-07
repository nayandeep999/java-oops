package com.kodewala.protectedV2;

import com.kodewala.protectedV1.Parent;

public class GrandChild extends Parent {
	@Override
	public void protectedMethod() {
		super.protectedMethod();
	}
}
