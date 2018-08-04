package com.cg.basicinheritance.shape;
/*
 * This class exhibits the property of inheritance
 * All the classes inheriting the Shape class can override the method defined in it
 * All the leaf classes can also access the instance members of the Parent Shape class
 */
public class DemoShape {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(8, 5);
		Triangle triangle = new Triangle(10, 10, 10);

		System.out.println("The area of circle is " + circle.getArea());
		System.out.println("The area of rectangle is " + rectangle.getArea());
		System.out.println("The area of triangle is " + triangle.getArea());

		// creating an array of objects of child classes under Shape
		Shape shape[] = new Shape[3];
		shape[0] = new Circle(5);
		shape[1] = new Rectangle(2, 3);
		shape[2] = new Triangle(2, 2, 2);

		for (int i = 0; i < 3; i++)
			shape[i].draw();
	}
}
