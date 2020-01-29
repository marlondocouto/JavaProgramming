
public class PowersOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPowersOfN(4,3);
		printPowersOfN(2,7);
		
	}
	public static void printPowersOfN(int number, int count) {
		// using count as the limit of the power series:
		for(int i=0; i<=count; i++) {
			int power = (int) Math.pow(number, i); // number to the power of i which will run until it hits the count
			System.out.print(power + " "); //print power and space all in the same line
		}
		System.out.println();
		
	}
}
