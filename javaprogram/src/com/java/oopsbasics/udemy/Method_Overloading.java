package com.java.oopsbasics.udemy;

public class Method_Overloading {
	
	public void addition(int a , int b){
		System.out.println(a+b);
	}
	
	public void addition(int a , int b , int c){
		
		System.out.println(a+b+c);
	}
	
	public void addition(double a , int b){
		System.out.println(a+b);
		
	}
	public void addition(int a , double b){
		
		System.out.println(a+b);
	}
	

}
