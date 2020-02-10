import java.io.File;

public class program_1 {

	public static void main(String[] args) {
		// create new object of the type file:
		File f = new File("hamlet.txt");
		System.out.println("Exists return: " +f.exists());  //boolean to check if file exists.
		System.out.println("Reads return: " + f.canRead()); //if it can be read.
		System.out.println("Length returns: " + f.length()); // the length in bits.
		System.out.println("Path will return: " + f.getAbsolutePath()); //path of the file.
	}

}
