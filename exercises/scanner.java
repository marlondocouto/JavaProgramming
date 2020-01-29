import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		System.out.print("How old are you? ");
		int age = console.nextInt();
		System.out.println("You typed " +age);
		
		console.close();
	}

}
