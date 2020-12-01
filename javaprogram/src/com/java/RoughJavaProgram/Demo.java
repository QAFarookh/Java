package com.java.RoughJavaProgram;

public class Demo {
	
	int id;

	
	Demo(int id){
	this.id=id;
	
	
	}
	
	public String toString(){ //overriding the toString() method
		String s=Integer.toString(id);
	return s;
	}
	
	public static void main(String args[]){
		Demo e1=new Demo(01);
	
	System.out.println(e1);
	
	}
}


