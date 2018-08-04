package com.cg.basicinheritance.third;

//to check if the variables can be directly or indirectly accessed
public class Check {
	private int number1 = 0;
	public int number2 = 8;
	protected int number3 = 6;
	int number4;

	// displaying only the private variable
	public void disp() {
		System.out.println("Variable is");
		System.out.println(number1);

	}
}
