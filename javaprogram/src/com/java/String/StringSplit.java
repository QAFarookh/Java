package com.java.String;

public class StringSplit {

	public static void main(String[] args) {
	
		String fullname = "Selenium-Hp-Qtp-Grid";
		
		String [] toolname = fullname.split("-");
		
		for (int i = 0; i < toolname.length; i++) {
			
			System.out.println(toolname[i]);
			
			if (toolname[i].contains("Selenium")) {
				
				System.out.println("Test Passed");
				
				break;
				
			}
			
		}

	}

}
