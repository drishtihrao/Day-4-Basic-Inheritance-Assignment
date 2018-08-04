package com.cg.basicinheritance.eighth;
/*
 * Child class inherits the Parent class
 * One can call both the methods using an object of the child class
 * If a string parameter is passed, the method of parent class is called
 * If an integer parameter is passed, the method of child class is called
 */
public class FunctionOverload {
	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		child.display(50);
		child.display("Drishti");
	}
}
