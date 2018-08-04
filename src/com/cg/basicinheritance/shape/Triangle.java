package com.cg.basicinheritance.shape;

//class triangle would inherits the Shape class
public class Triangle extends Shape {
	int side1;
	int side2;
	int side3;

	public Triangle(int s1, int s2, int s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}

	// defining the functions of calculating the area and perimeter 
	public double getArea() {
		area = 0.5 * side1 * side2;
		return area;
	}

	public double getPerimeter() {
		perimeter = side1 + side2 + side3;
		return perimeter;
	}

	//overriding the draw function of Shape class
	public void draw() {
		System.out.println("Drawing a triangle");
	}

}
