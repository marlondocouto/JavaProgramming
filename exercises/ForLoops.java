
public class ForLoops {

	public static void main(String[] args) {
		// Program to run through loops
		/*for (int i=1; i<=10; i=i+2){
			System.out.println(i+ " squared is equal to " +(i*i));
		}*/
		/*for (int i=1; i<=6; i++){
			for (int j=1; j<=3; j++) {
				System.out.print(j+ " ");
			}
		}*/
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
