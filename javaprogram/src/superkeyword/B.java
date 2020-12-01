package superkeyword;

public class B extends A {
	
	int b = 200;

public void doThis(){
	
	System.out.println("Do this for b na");
}

public void Machaenge(){
	
	super.doThis();
	
	System.out.println("Macahene is executed");
}

}
