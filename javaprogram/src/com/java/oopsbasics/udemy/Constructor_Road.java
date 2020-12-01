package com.java.oopsbasics.udemy;

public class Constructor_Road {
	
	String type;
	int    tyrescount;
	
	public void calculatetoll(){
		if ( tyrescount==2) {
			System.out.println("Amount is 0");
		}
		
		if (tyrescount==4) {
			
			System.out.println("Amount is 10");
			
		}
		
		if (tyrescount>4) {
			
			System.out.println("Amount is 30");
			
		}
	}
		public Constructor_Road(){
			
			System.out.println("Constructor is executed");
		
	}
		
		public Constructor_Road(String type ,int tyrescount){
			this.type = type;
			this.tyrescount = tyrescount;
		}
	

}
