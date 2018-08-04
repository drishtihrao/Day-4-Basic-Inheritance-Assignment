package com.cg.basicinheritance.fifth;
/*
 * This class exhibits a multi-level inheritance
 * Class Mult_A is the parent class which is inherited by class Mult_B
 * Class Mult_B is inherited by class Mult_C
 */

public class MultiLevelInheritance {
	public static void main(String args[]) {
		Mult_C write = new Mult_C();
	}
}

	class Mult_A {
		Mult_A() {
			System.out.println("I like reading");
		}
	}

	class Mult_B extends Mult_A {
		Mult_B() {
			System.out.println("I do not like reading");
		}
	}

	class Mult_C extends Mult_B{
		Mult_C(){
			System.out.println("I prefer movies");
		}
	}
