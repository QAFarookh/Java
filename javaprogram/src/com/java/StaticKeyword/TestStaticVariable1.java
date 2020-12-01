package com.java.StaticKeyword;

 class Student{
	
	int id;
	String name;
	String college="GIET";
	
	Student(int i ,String n){
		
		id = i;
		name = n;	
		
	}
	
	void display(){
		
		System.out.println(id +"  "+name);
	}
	
	
}

public class TestStaticVariable1 {

	public static void main(String[] args) {
		
		Student st  = new Student(101,"Shaym");
		Student st1 = new Student(102,"Rakul");
		st.display();
		st1.display();
        
	}

}
