package com.java.ObjectClass;

class Student3{
	
	int id;
	String name;
}

public class TestStudent3 {
	public static void main(String[]args){
		Student3 st = new Student3();
		Student3 st1 = new Student3();
		st.id=100;
		st1.id=101;
		st.name="sonu";
		st1.name="ritwika";
		System.out.println(st.id+"  "+st.name);
		System.out.println(st1.id+"  "+st1.name);
	}

}
