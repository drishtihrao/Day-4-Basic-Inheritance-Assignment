package com.cg.basicinheritance.eighth;
/*
 * The child class has the same method name as the method in parent class
 * This method has an integer parameter
 */
public class ChildClass extends ParentClass {
	void display(int number) {
		System.out.println("Number is " + number);
	}
}