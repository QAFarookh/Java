package com.selenium.StringComparison;

public class StringComaprison1 {

	public static void main(String[] args) {
	
		String s1 = "Farookh";
		String s2 = "Farookh";
		String s3 = "Farookh";
		String s4 = new String("farookh");
		String s5 = "Rohan";
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));   //Here in equalsIgnoreCase(),it will ignore the case only will check the content isright or not. 
		System.out.println(s1.equals(s5));

	}

}
