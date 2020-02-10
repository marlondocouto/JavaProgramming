
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=30, b=1;
			int result = a/b; //cant divide by zero;
			System.out.println("Result is " + result);
		} catch (ArithmeticException e) {//you can also use a generic Exception;
			//e is the object of the exception;
			System.out.println("Can't divide by 0!");
		}
	}

}
