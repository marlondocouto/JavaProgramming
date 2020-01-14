
public class BMI_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateBMI(195,70);
	}
	public static void CalculateBMI(double weight,double height) {
		double BMI = (weight /(height*height))*703;
		System.out.println("your BMI is ");
		System.out.println(BMI); //look up how to round;
	}

}
