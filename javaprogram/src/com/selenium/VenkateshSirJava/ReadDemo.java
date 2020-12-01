package com.selenium.VenkateshSirJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			
			FileInputStream fis = new FileInputStream(args[0]);
			int n = fis.available(); //memeory allocated in ram
			byte[] b = new byte[n];
			int x = fis.read(b);  
			String s = new String(b); // byte converted to String
			System.out.println(s);
			fis.close();
			
		}
		catch (Exception e)
		{
			
			System.err.println(e);
		
		}
		
		

	}

}
