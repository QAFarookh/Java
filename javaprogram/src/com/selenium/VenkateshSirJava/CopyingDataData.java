package com.selenium.VenkateshSirJava;

import java.io.FileInputStream;                 //io package imported
import java.io.FileOutputStream;

public class CopyingDataData {                 //Without class we cannot develop application

	public static void main(String[] args) {   //without main method we cannot execute prgrm under os
		
		FileInputStream fis =null;                   //Local Variable must be initialized
		FileOutputStream fos =null;
		
		try {
			
			FileInputStream fis = new FileInputStream(args[0]); //File Open for reading
			int n = fis.available();  //Find out file size  , File size readout
			byte[] b = new byte[n];   //Allocate memory in a RAM acording to file size , these are byte Strings , which can be used to copy for text ,image , video audio etc.
			fis.read(b);              //Read data from file , hard disk to ram 
			FileOutputStream fos = new FileOutputStream(args[1]); // another file opened for writing
			fos.write(b);             //Write data to a file
			
		} catch (Exception e) {                  
			
			System.err.println(e);                
		}
		
		finally {
			try {
				
			} catch (Exception e2) {
				
				System.err.println(e);
			}
	
		}

	}

}
