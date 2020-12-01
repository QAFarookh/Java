package com.java.StaticKeyword;

public class Count1 {
	
	static int count = 1;
	
	Count1(){
		
		count++;
		
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		Count1 c1 = new Count1();
		Count1 c2  = new Count1();
		Count1 c3 = new Count1();
		

	}

}

//Static variable will get the memory only once, if any object changes the value of the static variable, it will retain its value.

