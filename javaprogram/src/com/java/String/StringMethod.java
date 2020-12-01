package com.java.String;

public class StringMethod {

	public static void main(String[] args) {
		
		String s = new String("Hello");
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(4));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.indexOf("e"));
		s = s.concat(" Software Engg");
		System.out.println(s);
		System.out.println(s.codePointAt(2));
		System.out.println(s.compareTo("hello"));
		System.out.println(s.trim());
		System.out.println("status is = "+s.startsWith("h"));
		System.out.println("status is "+s.startsWith("H"));
		System.out.println("status is "+s.endsWith("o"));
		String s1 = "Welcome";
		String s2 = "Welcome";
	    boolean Result =  s1.equals(s2);
		System.out.println("Result is "+ Result);

	}

}
