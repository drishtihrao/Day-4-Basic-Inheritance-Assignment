package com.cg.basicinheritance.third;

class CheckDemo {
	public static void main(String args[]) {
		Check red = new Check();
		red.disp();
		System.out.println(red.number2); // public variable can be accessed directly
		// System.out.println(red.number1);
		System.out.println(red.number3); // protected variable can also be directly accessed 
		System.out.println(red.number4); // default variable displays the value of zero
	}
}
