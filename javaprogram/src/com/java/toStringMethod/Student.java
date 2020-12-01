package com.java.toStringMethod;

public class Student {
	
	int id;
	
	String name;
	
	String city;
	
	
	Student(int id , String name , String city){
		
		this.id = id;
		this.name = name;
		this.city = city;
	}	
		public static void main(String[]args){
			
			Student s1 = new Student(01, "xyz", "Hyd");
			Student s2 = new Student(02, "abc", "kol");
			
			System.out.println(s1);
			System.out.println(s2);
			
		}
		
		/*Here s1 and s2 object prints hashcode but we want to print our values
		 *  java compiler internally calls toString() method, overriding this method will return the specified values
		 */
		
	

}
