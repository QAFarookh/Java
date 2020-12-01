package com.java.stringadditionsubstring;

public class StringAdditionSubstring {

	public static void main(String[] args) {
		
		String s1 = "Farookh";
		String s2 = " Software Tester";
		
		System.out.println(s1 + s2);
		System.out.println(s1+10+20);
		System.out.println(10+s1+20);
		System.out.println(10+20+s1);
		System.out.println(s1+10*20);
		System.out.println(s1+100/2);
		System.out.println(s1.concat(s2));
		System.out.println(String.join(" ::: ", s1,s2,s1)); //Join returns the value in String.
		

	}

}
