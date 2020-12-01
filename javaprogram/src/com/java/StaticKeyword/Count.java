package com.java.StaticKeyword;

public class Count {
	
	int count = 1;
	
	Count(){
		
		count++;
		
		System.out.println(count);
	}
	
	/*void display(){
		
		System.out.println(count);
	}*/

	public static void main(String[] args) {
		
		Count c1 = new Count();
		Count c2  = new Count();
		Count c3 = new Count();
		

	}

}

/*In this example, we have created an instance variable named count which is incremented in the constructor. 
Since instance variable gets the memory at the time of object creation, each object will have the copy of the instance variable.
If it is incremented, it won't reflect other objects. So each object will have the value 1 in the count variable.*/