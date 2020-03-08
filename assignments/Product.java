import java.text.NumberFormat;

public class Product {
	//declaring the state:
	private int code;
	private double price;
	private int count;
	private String description;
	
	//constructor:
	public Product(int initialcode, double initialprice, 
			int initialcount, String initialdescrip) {
		code = initialcode;
		price = initialprice;
		count = initialcount;
		description = initialdescrip;
	}
	//second constructor to allow empty objects:
	public Product() {
		code = 0;
		price = 0.0;
		count = 0;
		description = "";
	}
	//toString class:
	public String toString() {
		return "code: " +code+"; price: "+getPriceFormatted()+"; count: "+count+
				"; description: "+description;
	}
	//formatted class:
	public String getPriceFormatted() {
		String formattedPrice = 
				NumberFormat.getCurrencyInstance().format(this.price);
		return formattedPrice;
	}
	//ACCESSORS:
	
	//get code:
	public int getCode() {
		return code;
	}
	
	//get price:
	public String getPrice() {
		return getPriceFormatted();
	}
	
	//get count:
	public int getCount() {
		return count;
	}
	
	//get description:
	public String getDescription() {
		return description;
	}
	
	//modify the product:
	public void modifyProduct(int newCode, double newPrice, int newCount,
			String newDescription) {
		code = newCode;
		price = newPrice;
		count = newCount;
		description = newDescription;
	}
	//adding count of products:
	public void addCount(int additionalCount) {
		count += additionalCount;
	}
}
