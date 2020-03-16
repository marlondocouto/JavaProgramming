public class StudentAdvanceTicket extends AdvanceTicket{
	private int daystoevent;
	public StudentAdvanceTicket(int number, int daystoevent) {
		super(number);
		this.daystoevent=daystoevent;
	}
	public double getPrice() {
		if(daystoevent>=10) {return 15;}
		else {return 10;}
	}
	public String toString() {
		return "Number: "+getNumber()+"; Price: "+getPrice();
	}
}