import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create array:
		int[] numbers = new int[10]; //10 here means array will have 10 items;
		
		//assign values to elements:
		numbers[0]=42;
		numbers[5]= 7;
		
		System.out.println(numbers[0]);
		
		System.out.println(Arrays.toString(numbers));
		
		for (int i=0; i< numbers.length; i++) {
			numbers[i] = i*i;
			System.out.print(numbers[i]+" ");
		}System.out.println();
		
		//create array with literal syntax:
		int[] Data = {1,2,3,4,5};
		System.out.println(Arrays.toString(Data));
		
		//two dimensional arrays:
		double[][] temp = new double[3][5];//array with 3 rows and 5 columns
		//populate first row first column:
		temp[0][0] = 98.3;
		//populate second row first column:
		temp[0][1] = 85.1;
		temp[0][2] = 77.4;
		temp[0][3] = 70.5;
		temp[0][4] = 88.9;
		
		for(int i=0; i<temp.length;i++) {
			for(int j=0; j<temp[i].length;j++) {
				System.out.print(temp[i][j] + " ");
				}
			System.out.println();
		}
	}

}
