
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 8;
		halfTheFun(11);
		halfTheFun(2-3+2*8);
		halfTheFun(number);
		System.out.println("number = " + number);
	}
	public static void halfTheFun(int number) {
		number = number /2;
		for (int count = 1; count <= number; count++) {
			System.out.print(count + " ");
		}
		System.out.println();
	}

}
