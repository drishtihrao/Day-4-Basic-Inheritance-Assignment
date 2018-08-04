package com.cg.basicinheritance.shape;

//class rectangle would inherit the Shape class
public class Rectangle extends Shape {
	private int length;
	private int breadth;
	
	public Rectangle (int l, int b) {
		this.length = l;
		this.breadth = b;
	}
	//overriding the draw function of Shape class
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
	// defining the functions of calculating the area and perimeter 
	public double getArea() {
		area = length*breadth;
		return area;
	}
	
	public double getPerimeter() {
		perimeter = length+ breadth;
		return perimeter;
	}
}