
public class productMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product iPad = new Product (001,120.00,20,"tablet");
		Product PC = new Product (002, 500.00,5,"table top computer");
		System.out.println(iPad);
		System.out.println(PC);
		
		System.out.println(iPad.getPrice());
		System.out.println(PC.getCount());
		
		iPad.modifyProduct(003, 140.00, 10, "new generation tablets");
		PC.addCount(10);
		System.out.println(PC.getCount());
	}

}
