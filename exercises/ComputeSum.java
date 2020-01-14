
public class ComputeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computeSum(7,3);
	}
	
	public static void computeSum(int x, int y) { //void works here because im printing
		//from this method; if returning, it wouldnt have worked.
		double sum = x+y;
		System.out.println("sum = "+ sum);
	}

}
