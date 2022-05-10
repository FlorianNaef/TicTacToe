package tictactoe;

public class Player {
	// Attributes
	private String symbol;
	private int number;
	private int take;
	
	// Constructor
	public Player(String symbol, int num) {
		this.symbol = symbol;
		this.number = num;
	}
	
	// Getters
	public String getSymbol() {
		return this.symbol;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public int getTake() {
		return this.take;
	}
}
