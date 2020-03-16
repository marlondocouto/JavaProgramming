public class AdvanceTicket extends Ticket{
	private int daystoevent; //add daystoevent in order to calculate the price
	public AdvanceTicket(int number) {
		super(number); //overrides the number for the superclass ticket
	}
	public AdvanceTicket(int number, int daystoevent) {
		super(number);
		this.daystoevent=daystoevent;
	}
	public double getPrice() { //if more than 10 days, 30 dollars;
		if (daystoevent>=10) {return 30;}
		else {return 40;} //if less than 10 days, 40 dollars;
	}
	public String toString() {
		return "Number: "+getNumber()+"; Price: "+getPrice();
	}
}