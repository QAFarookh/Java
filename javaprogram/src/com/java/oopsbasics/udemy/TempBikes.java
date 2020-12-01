package com.java.oopsbasics.udemy;

public class TempBikes {

	public static void main(String[] args) {
		
		Bikes b1 = new Bikes();
		Bikes b2 = new Bikes();
		
		b1.colour = "Red";
		b2.colour = "Green";
		b1.type   = "Scooter";
		b2.type   = "MotorBike";
		b1.model  =  "Activa";
		b2.model  =  "Royal Enfeild classisc 350";
		
		b1.displayDetails();
		b2.displayDetails();

	}

}
