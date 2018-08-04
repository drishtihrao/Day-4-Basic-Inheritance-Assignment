package com.cg.basicinheritance.eighth;
/*
 * A method defined in the parent class is inherited by all the classes inheriting the Parent class
 * This method has a string parameter
 */
public abstract class ParentClass {
	void display(String name) {
		System.out.println("Name is " + name);
	}
}
