package com.java.oopsbasics.udemy;

public class Constructor_Road_Toll_Main {

	public static void main(String[] args) {
		
		Constructor_Road cr = new Constructor_Road();
		cr.type = "Honda";
		cr.tyrescount = 4;
		cr.calculatetoll();
		
		Constructor_Road cr2 = new Constructor_Road("Truck" , 6);
		cr2.calculatetoll();
		

	}

}
