package com.java.stringupdations;

public class StringUpdations {

	public static void main(String[] args) {
	
		String s = "this boy is irresponsible";
		
		System.out.println(s.replace("is","was"));
		System.out.println(s.replace("is", "was"));
		System.out.println(s.replaceFirst("is","was"));
		System.out.println(s.replaceAll("is", "was"));
		System.out.println(s.replaceAll("is(.)", "was")); //here (.) is known as regex(regular exression).
		System.out.println(s.replaceAll("is(.*)","was"));
	}

}
