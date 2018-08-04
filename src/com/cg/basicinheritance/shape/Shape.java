package com.cg.basicinheritance.shape;
/*
 * Shape is a \n abstract class which defines a method 
 * It has two instance members which are inherited by classes
 * The area and perimeter are calculated in uniquely for each class inheriting the Shape class
 */
public abstract class Shape {
	 protected double area;
	 protected double perimeter;
	
	public void draw() {
		System.out.println("Draw");
	}
}
