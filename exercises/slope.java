
public class slope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double slope1= slope(1,3,5,11);
		System.out.println(slope1);
	}
	public static double slope(int x1, int y1, int x2, int y2) {
		double dy= y2-y1;
		double dx=x2-x1;
		return dy/dx;
	}

}
