import java.util.Scanner;

public class scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		System.out.println("Type two numbers: ");
		int num1 = console.nextInt();
		int num2 = console.nextInt();
		
		double product1 = num1*num2;
		System.out.println("The product is "+ product1);
		}

}
