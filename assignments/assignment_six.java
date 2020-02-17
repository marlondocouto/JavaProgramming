/******************
 * BoyGirl method from assignment SIX
 * 
 * It takes a file and it reads the boys and girls
 * It adds the ints associated to each to a sum
 * And it prints the results.
 * 
 * By:Marlon Do Couto
 * Feb 16, 2020
 */

import java.util.*;
import java.io.*;
public class assignment_six {

	public static void main(String[] args) throws FileNotFoundException{
		//creating the reader for new File object:
		Scanner reader = new Scanner(new File("boyGirl.txt"));
		boyGirl(reader);
		reader.close();
	}
	public static void boyGirl(Scanner reader) {
		//declare variables for count and individual sums:
		int boys = 0;
		int sumboys=0;
		int girls=0;
		int sumgirls=0;		
		while (reader.hasNext()) {
			//reads the strings:
			reader.next();
			//once it finishes, it counts one boy
			boys++;
			//adds the in to the sumboys variable:
			sumboys+=reader.nextInt();
			//continues reading strings:
			reader.next();
			//counts one girl:
			girls++;
			//adds the int to the sumgirls variable:
			sumgirls+=reader.nextInt();
		}
		System.out.println(boys+" boys and "+ girls+" girls");
		System.out.println("Difference between boys' and girls' sums is "+Math.abs(sumgirls-sumboys));
	}

}
