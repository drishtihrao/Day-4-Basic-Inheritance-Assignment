package com.cg.basicinheritance.sixth;
/*
 * This is a test class to check the heirarchial inheritance exhibited by the classes
 * Classes Hello and Ohh inherit the Hi class
 * Hence the method defined in Hi class gets implicitly called when a new object of Hello and Ohh classes are made
 */
public class HeirarchialInheritance {
	public static void main(String[] args) {
		Hello n = new Hello();
		Ohh o = new Ohh();
	}
}
