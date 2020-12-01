package com.java.scannerclass;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please print the given String ");
		String str = sc.nextLine();
		String temporary = "";
		for (int i = 0; i < str.length()-1; i++) {
			temporary = str.charAt(i) + temporary;
		}
		System.out.println("reverse String is "+temporary);
	}

}
