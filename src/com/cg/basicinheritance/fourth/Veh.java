package com.cg.basicinheritance.fourth;
/*
 * Veh class inherits Vehicle class
 * It has one parameterised and one non-parameterised constructor
 */
public class Veh extends Vehicle {
	public Veh(int k, int l) {
		super(k, l);
		System.out.println("This is because of leaf node Veh");
	}

	public Veh() {
		System.out.println("This is no argument constructor");
	}
}
