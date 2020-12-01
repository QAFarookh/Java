package com.java.ObjectClass;

class Student5{
	int id;
	String name;
	int marks;
	
	void insert(int i , String n , int f){
		id = i;
		name = n;
		marks = f;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+marks);
	}
	
}

public class TestEmployee5 {

	public static void main(String[] args) {
		
		Student5 s1 = new Student5();
		Student5 s2 = new Student5();
		Student5  s3 = new Student5();
		
		s1.insert(101,"sonu", 560);
		s2.insert(102,"dany", 540);
		s3.insert(103, "sany", 309);
		
		s1.display();
		s2.display();
		s3.display();
		
		

	}

}
