package tictactoe.memento;

import tictactoe.Field;

public class BoardState {
	// Attributes
	private Field[] fields;

	// Constructor
	public BoardState(Field[] fields) {
		this.fields = fields;

	}

	// Getters and Setters
	public Field[] getFields() {
		return fields;
	}

	public void setFields(Field[] fields) {
		this.fields = fields;
	}
}
