import java.util.Scanner;
public class scanner4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("What is your first name? ");
		String firstname = console.nextLine();
		System.out.println("What is your last name? ");
		String lastname = console.nextLine();
		
		System.out.println(firstname.substring(0,1) + " Diddy " + lastname.toUpperCase() + " " + firstname + "-izzle");
	}

}
