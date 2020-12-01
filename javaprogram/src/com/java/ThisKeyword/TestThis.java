package com.java.ThisKeyword;

class Student{  
int rollno;  
String name;  
float fee;  
Student(int rollno,String name,float fee){  
	
rollno=rollno;  //parameters (formal arguments) and instance variables are same.
name=name;  
fee=fee; 

}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  

class TestThis{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit",5000f);  
Student s2=new Student(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  

/*The this keyword can be used to refer current class instance variable. 
 * If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.*/
 

