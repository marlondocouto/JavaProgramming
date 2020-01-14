
public class Fibonacci {

	public static void main(String[] args) {
		//From Building Java Programs 5th edition
		//Page 133, Exercise 3: Fibonacci sequence
		//Author: Marlon Do Couto
		int a=0,b=1,c;
		
		for(int i=1; i<=12;i++) {
			c=a+b; 
			a=b; 
			b=c; 
			System.out.print(a+ " ");
			/*first round: c=1,a=1, b=1, print a(1)
			 *second round: c=2, a=1, b=2, print a(1)
			 *third round: c=3, a=2, b=3, print a(2)
			 *fourth round: c=5,a=3,b=5, print a(3)
			 *... so forth until it hits 144, the 12th Fibonacci number */
			}

	}

}
