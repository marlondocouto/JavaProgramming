/* Assignment EIGHT
 * IsSorted
 * Checks an array to see if the numbers are ascending
 * By Marlon Do Couto
 * 
 */
public class isSorted {

	public static void main(String[] args) {
		
		double[] list1= {16.1,12.3,22.2,14.4}; //declare array list1
		double[] list2 = {1.5,4.3,7.0,19.5,25.1,46.2}; //declare array list2
		System.out.println(isSorted(list1));
		System.out.println(isSorted(list2));
	}
	public static boolean isSorted(double[] data) {
		double firstvalue = data[0]; //variable for the firstvalue at index0
		for(int i=1; i< data.length;i++) { //enter a loop to check
			double secondvalue = data[i]; //second value starts at index one
			if (firstvalue>=secondvalue) { //if the first value is greater than second
				return false;	//then it is not ascending, returns false
			}
			firstvalue=secondvalue; //otherwise, firstvalue becomes second value and loop starts again
		}
		return true;
	}
	}


