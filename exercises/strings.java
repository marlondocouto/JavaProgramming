
public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String student =  "Marlon";
		System.out.println(student.length()); /*tells the length of string*/
	
		// index     012345678901
		String s1 = "Stuart Reges";
		String s2 = "Marty Stepp";
		System.out.println(s1.substring(7,10));
		
		String book = "Building Java Programs";
		System.out.println(book.substring(9,13));
		
		//strings are immutable;
		String s= "lil bow bow";
		s=s.toUpperCase();
		System.out.println(s);
		
	}

}
