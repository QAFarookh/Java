package com.java.BasicsProgram;

public class ClassVariableExmp2 {
	
	static int x  = 10;

	public static void main(String[] args) {
		
		int x = 10;
		
		System.out.println(x);   //to access local variable we can go directly
		
		System.out.println(ClassVariableExmp2.x);  //to access class variable i this scenario we hv to use class name
	  
	}

}


//NOTE - Use CLASSNAME to access class variable whenever both class variable and local variable are same.

//Class - Main Method - //Instance