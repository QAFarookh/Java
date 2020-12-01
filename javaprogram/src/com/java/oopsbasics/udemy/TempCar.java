package com.java.oopsbasics.udemy;

public class TempCar {

	public static void main(String[] args) {
	
		Cars c1 = new Cars();
		c1.colour = "Blue";
		c1.make  = "Bmw";
		c1.type  = "suv";
		c1.display();
		
		Cars c2 = new Cars();
		c2.colour = "Red";
		c2.make ="Ferari";
		c2.type = "Xuv";
		c2.display();

	}

}
