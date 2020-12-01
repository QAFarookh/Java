package com.java.ObjectClass;

class Student7{
	
	
	int id;
	String name;
	float marks;

	
	void data(int i  ,String n, float m)
	{
		
		id = i;
		name = n;
		marks = m;
	 }
	
		
		void display()
		{
			
			System.out.println(id+" "+name+" "+marks);
		 }      	
		         }
 

public class TestEmp6 {

	public static void main(String[] args) {
		
		Student7 s1 = new Student7();
		Student7 s2 = new Student7();
		s1.data(105,"Nakul",350);
		s2.data(109,"Rohini", 450);
		
		/*s1.id = 1008;
		s2.id = 1003;
		s1.name = "Rahul";
		s2.name = "Manoj";
		s1.marks = 1200;
		s2.marks = 1350;*/

		
		s1.display();
		s2.display();
		

	}

}
