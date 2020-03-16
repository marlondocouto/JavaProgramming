public class WalkupTicket extends Ticket{
	public WalkupTicket(int number) {
		super(number);//overrides the superclass method to create the ticket
	}
	public double getPrice() {
		return 50; //all prices are the same for walkuptickets
	}
	public String toString() {
		return "Number: "+getNumber()+"; Price: "+getPrice();
	}
}