package inheritance;

public class Programmer extends Emp {
	
	int bonus = 10000;

	public static void main(String[] args) {
	
		Programmer p = new Programmer();
		System.out.println("Employee salary is : "+p.salary);
		System.out.println("Employee bonus is : "+p.bonus);
		

	}

}
 
//In this example programmer class can access its own field as well as Emp class aswell by using xtends keywrd.