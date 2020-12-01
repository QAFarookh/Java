package com.java.String;

public class String_Search {

	public static void main(String[] args) {
		
		String s1 = "I Love Qa Testing";
		String s2 = "Qa";
		
		System.out.println(s1.contains(s2));
		System.out.println(s1.toLowerCase().contains(s2.toLowerCase())); //Coverted to lowercase
		System.out.println(s1.startsWith("I"));
		System.out.println(s1.endsWith("Testing"));
        System.out.println(s1.indexOf("Qa"));
        System.out.println(s1.indexOf("Qa", 2));
	}

}
