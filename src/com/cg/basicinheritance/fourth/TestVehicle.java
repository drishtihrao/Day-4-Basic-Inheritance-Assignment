package com.cg.basicinheritance.fourth;
/*
 * An object of child class Veh is used to invoke the constructor of parent class Vehicle
 */
public class TestVehicle {
	public static void main(String[] args) {
		Veh car = new Veh(4, 6);
		Veh honda = new Veh();
		car.display();
		honda.display();
	}
}