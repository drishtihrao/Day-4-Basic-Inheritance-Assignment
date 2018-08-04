package com.cg.basicinheritance.shape;

//class circle would inherit the Shape class
public class Circle extends Shape {

	private int radius;
	private final double pi = 3.14;

	public Circle(int r) {
		this.radius = r;
	}
	//overriding the draw function of Shape class
	public void draw() {
		System.out.println("Drawing a circle");
	}

	// defining the functions of calculating the area and perimeter 
	public double getArea() {
		area = radius * radius * pi;
		return area;
	}

	public double getPerimeter() {
		perimeter = 2 * pi * radius;
		return perimeter;
	}
}