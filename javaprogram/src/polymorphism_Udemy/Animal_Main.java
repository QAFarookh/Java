package polymorphism_Udemy;


public class Animal_Main {

	public static void main(String[] args) {
		
	Animal a;
	a = new Animal();
	a.whoAreYou();
	
	a = new Dog();
	a.whoAreYou();
	
	a = new Cat();
	a.whoAreYou();
	
	}

	}


