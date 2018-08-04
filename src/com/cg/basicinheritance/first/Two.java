package com.cg.basicinheritance.first;
/*
 * Two classes are defined with their individual constructors
 * In the main class objects of both these classes are made
 * On object creation, their respective constructors are invoked
 */
class First {
	void display() {
		System.out.println("This is first class");
	}

	public First(int i, int j) {
		System.out.println("This is a parameterised method");
	}

	public First() {
		System.out.println("This is no argument method");
	}
}

class Second {
	void display() {
		System.out.println("This is second class");
	}
}

public class Two {
	public static void main(String args[]) {
		Second b = new Second();
		First guess = new First(3, 6);

		b.display();
		guess.display();
	}
}