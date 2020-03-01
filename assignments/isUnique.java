/*Assignment EIGHT
 * isUnique
 * Checks if any two elements in array are equal
 * By Marlon Do Couto
 */
public class isUnique {

	public static void main(String[] args) {
		int[] list1= {1,2,3,4,5,6,7}; //declare arrays list1, list2, list3
		int[] list2 = {1,2,3,1,4,5};
		int[] list3 = {10,11,100,99,88};
		System.out.println(isUnique(list1));
		System.out.println(isUnique(list2));
		System.out.println(isUnique(list3));

	}
	public static boolean isUnique(int[] data) {
		//using nested loop to check each index element against elements greater than it:
		for (int i=0;i<data.length;i++) { //starts at the first index of the array
			for (int j=i+1;j<data.length;j++) { //checking against all other greater ones:
				if (data[i]==data[j]) { //if it is similar to any other it returns false
					return false;
				}
			}// after going through all elements, if no equals found:
		}return true;
	}

}
