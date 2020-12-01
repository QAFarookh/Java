package com.java.StaticKeyword;

class Employee{
	
	int id;
	String name;
	static String company = "Alekas Solution Private Limited";
	
	Employee(int i, String n){
		
		id = i;
		name = n;
	}
	
	void display(){
		
		System.out.println(id +"       "+name+ "     " + company);
		
	}
	
}

public class StaticVariable3 {

	public static void main(String[] args) {
	
		Employee e1 = new Employee(99,"Syed");
		Employee e2 = new Employee(999,"Omer");
		Employee e3 = new Employee(9999,"Farookh");
		
		e1.display();
		e2.display();
		e3.display();

	}

}
