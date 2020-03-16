public abstract class Ticket{ //creating abstract superclass
	private int number; //number of the ticket
	
	public Ticket(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	public abstract double getPrice();
	public abstract String toString();
}
