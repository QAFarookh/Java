package randomclass;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Random r =new Random();
         for (int i = 0; i <100; i++) {
        	 System.out.println(r.nextInt(1000));
			
		}
	}

}
