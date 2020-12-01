package com.java.Constructor;

class StudentP4{  
    int id;  
    String name;  
  
    StudentP4(int i,String n){        //-- creating a parameterized constructor
    id = i;  
    name = n;  
    }  
   
    void display(){
    	System.out.println(id+" "+name);
    	}                                           //-- method to display the values  
    
    public static void main(String args[]){  

    StudentP4 s1 = new StudentP4(111,"Karan");       //creating objects and passing values  
    StudentP4 s2 = new StudentP4(222,"Aryan");  
    
 
    s1.display();     //--calling method to display the values of object  
    s2.display();  
   }  
}  