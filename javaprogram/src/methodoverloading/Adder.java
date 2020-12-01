package methodoverloading;

class Adder {
	
	 static int add(int a,int b){
			return a+b;
			}  
		static int add(int a,int b,int c){
			return a+b+c;
			}  
}
 class TestOverloading{
	 
	public static void main(String[] args) {
		
		System.out.println(Adder.add(10, 20));
		System.out.println(Adder.add(10, 20, 30));
		

	}

}
 
 //Here in this program two method created i.e add() but the no. of no of args is changed.
 //In this example, we are creating static methods so that we don't need to create instance for calling methods.
