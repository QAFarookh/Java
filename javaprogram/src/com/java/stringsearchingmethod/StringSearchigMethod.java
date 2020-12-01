package com.java.stringsearchingmethod;

public class StringSearchigMethod {

	public static void main(String[] args) {
		
		String s = "Farookh";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		int a = 12;
		int b = 20;
		System.out.println(a+b);         //32
		String s1 = String.valueOf(a);  //this is called typecoversion (to convert int-String use valueof())
		String s2 = String.valueOf(b);
		System.out.println(s1+s2);     //1220

	}

}
