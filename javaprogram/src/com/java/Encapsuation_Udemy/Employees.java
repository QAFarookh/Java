package com.java.Encapsuation_Udemy;

public class Employees {

	private String Empname;
	private int  Empid;
	private int salary;
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
     
	public void display(){
		System.out.println(Empname+" Id is "+Empid+" and salary is "+salary);
	}
	
}
