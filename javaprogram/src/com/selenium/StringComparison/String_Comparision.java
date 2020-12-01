package com.selenium.StringComparison;

public class String_Comparision {

	public static void main(String[] args) {
    

		/**
		 * Equals
		 * Compare To
		 * Matches
		 */
		
		String str1 = "ABCDE";
		String str2 = "aBCDE";
		
		System.out.println(str1.equals(str2));               //equals()
		System.out.println(str1.equalsIgnoreCase(str2));    //equalsIgnoreCase()
		
		if (str1.equals(str2)) {
			System.out.println("Strings are equal");       //if - else Statement
		} else {
			System.out.println("Strings not equal");
		}
		
		System.out.println(str1.compareTo(str2));           //compareTo()
		System.out.println(str1.compareToIgnoreCase(str2)); //compareToIgnoreCase()
		
		String patt = "[A-Z]{1,}";                               
		
		System.out.println(str1.matches(patt));           //matches()

	}

}
