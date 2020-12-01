package com.java.StaticKeyword;
class Student1{
	
	int id;
	String name;
	static String college = "Pmiet";
	
    Student1(int i ,String n){
    	
    	id = i;
    	name = n;
    }
    
    void display(){
    	
    	System.out.println(id + " "+name+" "+college);
    }
    
}
public class TestStaticVariable2 {

	public static void main(String[] args) {
		
		Student1 st1 = new Student1(9,"Syed");
		Student1 st2 = new Student1(3,"Omer");
		Student1 st3 =new Student1(7,"Farookh");
		
		st1.display();
		st2.display();
		st3.display();

	}

}
