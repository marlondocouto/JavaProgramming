
public class Stock {
	private String symbol;
	private int totalShares;
	private double totalCost;
	
	//initializing the new Stock with no shares purchased
	public Stock(String symbol) {
		this.symbol=symbol;
		totalShares=0;
		totalCost=0.0;
	}
	
	//returns the total profit or loss earned on the stock:
	public double getProfit(double currentPrice) {
		double marketValue = totalShares * currentPrice;
		return marketValue - totalCost;
	}
	
	//records purchase of a given shares at the given price:
	public void purchase(int shares, double pricePerShare) {
		totalShares += shares;
		totalCost += shares* pricePerShare;
	}
	
	public int getTotalShares () {
		return totalShares;
	}
	
}
