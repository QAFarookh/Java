package com.selenium.stringbufferdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		
     StringBuffer sb = new StringBuffer("welcome ");
     System.out.println("Default capacity is "+sb.capacity()); //returns integer
     sb.append("Java");                                       //returns string , it will concat at last
     System.out.println(sb);
     System.out.println(sb.length());                          //returns integer
     System.out.println(sb.charAt(5));                         //returns character
     System.out.println(sb.delete(2, 5));
     System.out.println(sb.);
	}

}
