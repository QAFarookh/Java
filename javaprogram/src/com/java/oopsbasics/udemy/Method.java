package com.java.oopsbasics.udemy;

public class Method {
	
	void display(){                               //method withou arguments
		System.out.println("do this program");
	}

	void Multiplication(int a , int b){          //method with arguments
		System.out.println(a*b);
	}
    int addition(int a , int b ){               //method with return type
		int c =  a +  b;
		return c;
	}
    int subtraction(int a , int b){            //method with return type
    	int c = a - b;
    	return c;
    }
	public static void main(String[] args) {
		
		Method m1 = new Method();
		m1.display();
		m1.Multiplication(10, 20);
		int x  = m1.addition(10, 30);
		System.out.println("Value for x is "+x);
		int y  = m1.subtraction(50, 20);
		System.out.println("value for y is "+y);
	
		
		
		
	}

}
