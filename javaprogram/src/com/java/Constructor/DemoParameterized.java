package com.java.Constructor;

public class DemoParameterized {
	
	DemoParameterized() {      //-- Default Constructor
		
		System.out.println("Allahamdullilah");
	}
	
	DemoParameterized(int x){   //-- Paramterized Constructor   
		
		System.out.println(x);
	}
	

	public static void main(String[] args) {  
		
		new DemoParameterized();
		new DemoParameterized(10);
		

	}

}
