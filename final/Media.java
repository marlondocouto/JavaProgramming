//abstract superclass:
public class Media {
	//declaring state:
	private int item;
	private String name;
	private String reserved;
	private String checkedIn;
	private double length;
	
	//first constructor
	public Media(int initialItem, String initialName, String initialreserved, String initialCheckedIn, double initialLength) {
		item=initialItem;
		name=initialName;
		reserved=initialreserved.toLowerCase();
		checkedIn=initialCheckedIn.toLowerCase();
		length=initialLength;
	}
	//second constructor to allow for creation of empty instances:
	public Media() {
		item=0;
		name="";
		reserved="";
		checkedIn="";
		length=0.0;
	}
	//METHODS:
	//to find out item number:
	public int getItemNumber() {
		return item;
	}
	//to find out name:
	public String getName() {
		return name;
	}
	//to find if item is reserved:
	public String isReserved() {
		return reserved;
	}
	//to find if item is checked in:
	public String isCheckedIn() {
		return checkedIn;
	}
	//to change if item is reserved:
	public void setReserved(String newReserved) {
		reserved=newReserved.toLowerCase();
	}
	//to change if item is checked in:
	public void setCheckedIn(String newCheckedIn) {
		checkedIn=newCheckedIn.toLowerCase();
	}
	//to calculate fines accrued in an item:
	public String finesAccrued(int daysLate) {
		if (daysLate != 0) {
		double totalFines=daysLate*0.50;
		return "Your total fines are: "+totalFines;}
		else { return "You have no fines in this item";}
	}
	//length:
	public double getLength() {
		return length;
	}
	public String toString() {
		return "Name: "+name+"; Item Number: "+item+";";
	}
		
}

