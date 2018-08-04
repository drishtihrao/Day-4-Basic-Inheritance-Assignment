package com.cg.basicinheritance.second;
/*
 * CLass to check the accessability of static and non-static instance members
 */
class Yes {
	private static int i = 10;
	private int flag = 0;

	public int getMethod() {
		if (flag == 0) {
			System.out.println("value of flag is " + flag);
			flag += 1;
		}
		return flag;
	}

	public static int getAnswer() {
		if (i == 0) {
			System.out.println("value of i is " + i);
			i += 1;
		}
		return i;
		
	}
}

public class StaticMember {
	public static void main(String args[]) {
		Yes yes = new Yes();
		int ok = yes.getMethod();
		int no = Yes.getAnswer();
		System.out.println("get method ans: " + ok);
		System.out.println("getAnswer ans: " + no);
	}
}
