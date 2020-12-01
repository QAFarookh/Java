package com.java.naranaraoslc.Inheritance;

public class Employee {
	
	static String company = "Tcs";
	double basicsalary = 14000;
	
	public void companyAddress(){
		System.out.println("Madhabpur, Hyderabad");
	}

}

class Programmer1 extends Employee{
	
	String name = "Syed";
	int id = 205;
	int bonus = 2000;
	double salary = bonus + basicsalary;
	
	public void display(){
		System.out.println(company+" "+name+" "+id+" "+ salary);
	}
	
}
class programmer2 extends Employee{
	
	String name = "Farookh";
	int id = 605;
	int bonus = 5000;
	double salary = bonus + basicsalary;
	
	public void display(){
		System.out.println(company+" "+name+" "+id+" "+ salary);
	}
		
}

class test{
	public static void main(String args[]){
		
	Programmer1 p1 = new Programmer1();
	p1.display();
	
	System.out.println(".......................................");
	
	programmer2 p2 = new programmer2();
	
	p2.display();
	
	
	
	
	
	
}}






