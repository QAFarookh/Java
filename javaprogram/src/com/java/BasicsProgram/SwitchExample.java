package com.java.BasicsProgram;

public class SwitchExample {

	public static void main(String[] args) {
/*
	    //Declaring a variable for switch expression  
	    int number=20;
	    
	    //Switch expression  
	    switch(number){ 
	    
	    //Case statements  
	    case 10: System.out.println("10");  
	    break;  
	    
	    case 20: System.out.println("20");  
	    break;
	    
	    case 30: System.out.println("30");  
	    break;
	    
	    //Default case statement  
	    default:System.out.println("Not in 10, 20 or 30");
	    
	    } 
	    */
		   int day = 5; 
	        String dayString; 
	  
	        // switch statement with int data type 
	        switch (day) { 
	        case 1: 
	            dayString = "Monday"; 
	            break; 
	        case 2: 
	            dayString = "Tuesday"; 
	            break; 
	        case 3: 
	            dayString = "Wednesday"; 
	            break; 
	        case 4: 
	            dayString = "Thursday"; 
	            break; 
	        case 5: 
	            dayString = "Friday"; 
	            break; 
	        case 6: 
	            dayString = "Saturday"; 
	            break; 
	        case 7: 
	            dayString = "Sunday"; 
	            break; 
	        default: 
	            dayString = "Invalid day"; 
	            break; 
	        } 
	        System.out.println(dayString); 
	    } 
	

	}


