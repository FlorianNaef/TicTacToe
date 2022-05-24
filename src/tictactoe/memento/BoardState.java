package tictactoe.memento;

import tictactoe.Field;

/**
 * @author Florian Naef
 * @author Filip Vrlec
 * 
 *         This class serves the memento pattern.
 */
public class BoardState {
	// Attributes
	private Field[] fields;

	// Constructor
	/**
	 * @param fields adds fields to this state
	 */
	public BoardState(Field[] fields) {
		this.fields = fields;
	}

	// Getters and Setters
	/**
	 * @return the fields, which we can then use to get our old state of our board
	 */
	public Field[] getFields() {
		return fields;
	}

	/**
	 * @param fields
	 */
	public void setFields(Field[] fields) {
		this.fields = fields;
	}
}