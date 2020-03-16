public class DividendStock extends Stock {
	private double dividends; //amount of dividend paid
	public DividendStock(String symbol) {
		super(symbol); //call stock constructor
		this.dividends = 0.0;
	}

	
	public void payDividend(double amountPerShare) {
		dividends += amountPerShare * getTotalShares();
	}
}
