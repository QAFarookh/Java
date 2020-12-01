package com.java.ObjectClass;

class Employee6{
	
	int id;
	String name;
	Float salary;
	
	void datainsert(int i,String n,float j){
		
		id = i;
		name = n;
		salary = j;
		
	}
	
	void displayy(){System.out.println(id+" "+"name"+""+salary);}
	
}

public class TestEmployee6 {

	public static void main(String[] args) {
    
		Employee6 emp1 = new Employee6();
		Employee6 emp2 = new Employee6();
		Employee6 emp3 = new Employee6();
		
		emp1.datainsert(202,"ratikant",30000);
		emp2.datainsert(103,"Sahil",  23000);
		emp3.datainsert(105,"Farookh",  500000);
		
		emp1.displayy();
		emp2.displayy();
		emp3.displayy();
		
		
		

	}

}
