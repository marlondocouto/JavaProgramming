
public class Book extends Media{
	
	//book constructor:
	public Book(int item, String name, String reserved, String checkedIn, double length) {
		super(item, name, reserved, checkedIn,length);
	}
	//new toString to reflect book information:
	public String toString(){
		return "This is the book "+super.getName()+"; its item number is "+super.getItemNumber()+
				".\nIs the item reserved? "+super.isReserved()+
				".\nIs the item checkedIn? "+super.isCheckedIn()+
				".\nThe length of the book is "+(int)super.getLength()+" pages";
	}
	
}
