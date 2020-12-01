package com.java.VenkateshEveningBatch;

public class Demo {
	
	void display (int...a){   //variable args VarArgs
		
		for(int b:a){
			
			System.out.println(b);
			
		}
		
		
	}

	public static void main(String[] args) {
	
		Demo d =  new Demo();
		
        d.display(34, 20, 45, 67 , 34);  //By using VarArgs you can pass n no of  values.
	}

}
