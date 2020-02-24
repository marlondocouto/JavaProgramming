package testDay;

public class isPowerOf2 {

	public static void main(String[] args) {
		System.out.println(isPowerOf2(5));
		System.out.println(isPowerOf2(0));
		
	}
	public static boolean isPowerOf2(int number) {
		boolean isPowerOf2= true; //creates boolean statement = true;
		int reminder = 0; //creates reminder variable so that it can enter the while
		while (number>1) {
			reminder = number %2;//changes the reminder for whatever number has been called in parameter
			if (reminder!=0) { //if reminder is not zero i.e. number is not divisible by two:
				isPowerOf2= false;//boolean statement becomes false;
				break; //breaks and returns the boolean statement since a number not divisible by two cant be a power of 2;
			}else {
				number=number/2; //reassigns the number which is divisible by two so that it can go through while loop again.
			}
		}
		return isPowerOf2;
		
	}
}