package com.selenium.StringComparison;

public class StringComparison2 {

	public static void main(String[] args) {
		
		String a = "Farookh";
		String b = "FAROOKH";
	 	String c = new String("Farookh");
	 	String d = "Farookh";
		System.out.println(a == b);
		System.out.println(a == c);  //false(because s3 refers to instance created in non-pool) 
		System.out.println(a ==d);

	}

}

 //String compare by (==) operator.