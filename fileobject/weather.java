import java.io.*;
import java.util.*;

public class weather {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new File("weather.txt"));
		double prev = input.nextDouble(); //fencepost - reads first double
		while (input.hasNextDouble()) /*while the next double is returned True:*/{
			double next = input.nextDouble();
			System.out.println(prev + " to " + next);
			System.out.println("Change: " + (next - prev));
			prev = next;
		}
	}

}
