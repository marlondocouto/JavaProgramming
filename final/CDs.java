
public class CDs extends Media{
	
	//Cds constructor:
	public CDs(int item, String name, String reserved, String checkedIn, double length) {
		super(item, name, reserved, checkedIn,length);
	}
	public String toString() {
		return "This is the CD "+super.getName()+" and its item number is "+super.getItemNumber()+
				".\nIs the item reserved? "+super.isReserved()+
				".\nIs the item checked in? "+super.isCheckedIn()+
				".\nIts length is: "+(int)super.getLength()+" hours and "+(int)((super.getLength()%1)*100)+" minutes.";
	}
}
