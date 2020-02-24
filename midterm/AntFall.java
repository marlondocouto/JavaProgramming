package testDay;

import java.util.Random;

public class AntFall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int falls=0;
		int position=0;
		while (position<6) {
			int fallup=r.nextInt(2); //chance it will fall or not(0 or 1)
			if(fallup==0){//ant going down
				position=0; // position remains at zero
				falls++; //fall count goes up one
			}
			else {
				position++;

			}
		}
		System.out.println("The ant has fallen "+ falls +" times!");
	}

}
