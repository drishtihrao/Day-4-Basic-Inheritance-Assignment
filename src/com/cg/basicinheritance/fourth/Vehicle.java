package com.cg.basicinheritance.fourth;
/*
 * Vehicle is a parent class which has one non-parameterised constructor
 * It has two parameterised constructors - one with one parameter and one with two parameters
 */
public class Vehicle {
	public Vehicle() {
		System.out.println("This is non parameterised");
	}

	public void display() {
		System.out.println("Display");
	}

	public Vehicle(int i, int j) {
		System.out.println(i + "," + j + "These are parameters");
	}
}
