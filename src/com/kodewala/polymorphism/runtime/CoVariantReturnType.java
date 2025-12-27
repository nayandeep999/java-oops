package com.kodewala.polymorphism.runtime;

class CPU {
	protected CPU doCalculation() {
		System.out.println("CPU.doCalculation()");
		return new CPU();
	}
}

class IntelI5 extends CPU {
	@Override
	public IntelI5 doCalculation() {
		System.out.println("IntelI5.doCalculation()");
		return new IntelI5();
	}

	public void doI5Specific() {
		System.out.println("IntelI5.doI5Specific()");
	}
}

public class CoVariantReturnType {

	public static CPU runCPU(CPU cpu) { // can return sub type i.e. sub class type
		return cpu.doCalculation();
	}

	public static void main(String[] args) {

		CPU c = new CPU();
		CPU i5 = new IntelI5();

		c = runCPU(c);
		i5 = runCPU(i5); // since runCPU is returning a CPU reference type during compilation thats we
		// can store this in a i5 (CPU) reference

		((IntelI5) i5).doI5Specific(); // down-casting CPU to Inteli5

	}

}
