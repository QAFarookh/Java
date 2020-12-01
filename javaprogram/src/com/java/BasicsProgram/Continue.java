package com.java.BasicsProgram;

public class Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10 ; i++) {
			
			if (i==6) {
				
				continue;    // - It will forgot what code is written if loop but continues to execute other loop
				
			}
			
			System.out.println(i);
		}

	}

}
