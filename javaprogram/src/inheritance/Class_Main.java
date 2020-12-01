package inheritance;

public class Class_Main {

	public static void main(String[] args) {
        Class2 cs = new Class2();  //Creating object
        cs.num1 = 1000;            //Initializing the values
        cs.num2 = 500;
        
        cs.doAddition();          //Call the method to get the value
        cs.doSubtraction();
        
	}

}
