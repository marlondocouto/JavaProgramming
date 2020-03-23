
public class MediaMain {

	public static void main(String[] args) {
		// Creating objects and adding info to them:
		Book book1 = new Book(001,"The Nordic Theory of Everything", "NO","YES",324.0);
		DVDs dvd1= new DVDs(010,"Contagion","YES","YES",2.15);
		System.out.println(book1.getLength());
		System.out.println(dvd1.getName());
		System.out.print(book1.toString());
		System.out.println();
		System.out.print(dvd1.toString());
		book1.setCheckedIn("YES");
		System.out.println();
		System.out.println(book1);
		
		
		

	}

}
