package com.java.ThisKeyword;

class Students{  
int rollno;  
String name;  
float fee;  
Students(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;                      //In the above example, parameters (formal arguments) and instance variables are same.So to execute this we have to use this keyword
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis1{  
public static void main(String args[]){  
Students s1=new Students(111,"ankit",5000f);  
Students s2=new Students(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}   

//In the above example, parameters (formal arguments) and instance variables are same.
//So, we are using this keyword to distinguish local variable and instance variable.