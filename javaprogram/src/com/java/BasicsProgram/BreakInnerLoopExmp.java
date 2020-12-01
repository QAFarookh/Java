package com.java.BasicsProgram;

public class BreakInnerLoopExmp {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				
				if (i==2 && j==2) {
					
					break;
					
				}
				
				System.out.println(i+"  "+j);
			}
			
		}

	}

}
