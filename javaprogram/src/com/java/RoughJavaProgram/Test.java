package com.java.RoughJavaProgram;

 class MethodOverloading {
	
	static int Multiply(int a, int b){
		return a*b;
	}
	static int Multiply(int a, int b,int c){
		return a*b*c;
	}
}


public class Test{
	
	public static void main(String[] args) {
		
		System.out.println(MethodOverloading.Multiply(2,4));
		System.out.println(MethodOverloading.Multiply(5,7,4));

	}

}
