package peopleinhetirance;

import java.util.Random;

public class Randomnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 0, count = 0;
		Random rndm = new Random( );
		for(int j = 0; j < 33; j++) {
		r = 71 + rndm.nextInt(29);
		System.out.print(r + " ");

		count++;
		if(count >15) {
		System.out.println(" ");
		count = 0;
		}
		}
		
		Random rndm1 = new Random( );
		double r1;
		for(int ji = 0; ji <27; ji++){
		r1 = 99.78 + 47.34 * rndm1.nextDouble( );
		System.out.print(r + " ");
	
		count++;
		if(count >15) {
		System.out.println(" ");
		count = 0;
		}
		}
	}

}
