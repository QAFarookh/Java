package com.selenium.StringComparison;

public class StringComparison3 {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Python";
		String s3 = "Java";
		String s4 = "java";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));  //only compareTo()
		System.out.println(s1.compareToIgnoreCase(s4));  //Here compareToIgnoreCase()

	}

}

/*Suppose s1 and s2 are two string variables. If :
s1 == s2 :0 ( If both are equal it will give 0 )
s1 > s2   :positive value
s1 < s2   :negative value*/