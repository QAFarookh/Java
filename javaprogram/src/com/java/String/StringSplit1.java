package com.java.String;

public class StringSplit1 {

	public static void main(String[] args) {
		
		String name = "Hello-Selenium-World-2020";
		
		String [] value = name.split("-");
		
		for(int i=0; i<value.length; i++){
			
			System.out.println(value[i]);
			
			if (value[i].contains("Selenium")) {
				
				System.out.println("Test passed");
				
				break;
			}
		}

	}

}
