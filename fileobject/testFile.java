import java.io.*;

public class testFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream output = new PrintStream(new File("hello.txt"));
		
		output.println("Hello world");
		output.println();
		output.println("This program produces");
		output.println("four lines of output");
		output.println("the old content is gone.");
		
		output.close();
	}

}
