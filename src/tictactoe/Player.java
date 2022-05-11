package tictactoe;

/**
 * 
 * @author filip
 * @version 1.0
 * 
 *          The player has a certain symbol, the player number and the amount of
 *          takes will be tracked.
 */
public class Player {
	// Attributes
	private String symbol;
	private int number;
	private int take;

	// Constructor
	/**
	 * 
	 * @param symbol sets the symbol value ("X" or "O")
	 * @param num    sets the player number
	 */
	public Player(String symbol, int num) {
		this.symbol = symbol;
		this.number = num;
	}

	// Getters
	/**
	 * @return the symbol value
	 */
	public String getSymbol() {
		return this.symbol;
	}

	/**
	 * @return the player number (i.e. player 1, player 2)
	 */
	public int getNumber() {
		return this.number;
	}

	/**
	 * @return the amount of takes the player took
	 */
	public int getTake() {
		return this.take;
	}
}
