package com.java.toStringMethod;

public class StudentToString {

    int id;
	
	String name;
	
	String city;
	
	
	StudentToString(int id , String name , String city){
		
		this.id = id;
		this.name = name;
		this.city = city; }
	
	public String toString(){                                //- Overriding the toString() method  
		return id +"  " +name+"  " +  city; }
		
	public static void main(String[] args) {
		
		StudentToString s1 = new StudentToString(01, "xyz", "Hyd");
		StudentToString s2 = new StudentToString(02, "abc", "kol");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
