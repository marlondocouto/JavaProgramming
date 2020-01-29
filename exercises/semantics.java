
public class semantics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 23;
		strange(x); 
		/*it goes to strange:
		 * x=23 and strange adds 1 to it
		 * prints 24 (which is 23 +1)
		 */
		System.out.println("2. x=" +x);
		/*now it goes to the print above
		 * which basically just prints x
		 * which here still equals 23
		 */
		
	}
	public static void strange(int x) {
		x = x+1;
		System.out.println("1. x=" +x);
	}

}
