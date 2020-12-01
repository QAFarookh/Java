package methodoverloading;

public class MethodOverloadingAdd_Main {

	public static void main(String[] args) {
		
		MethodOverloadingAdd mo = new MethodOverloadingAdd();
		int x = mo.add(10, 20);
		System.out.println(x);
		 int y = mo.add(10, 20, 30);
		 System.out.println(y);

	}

}
