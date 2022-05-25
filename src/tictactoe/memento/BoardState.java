package tictactoe.memento;

import java.util.ArrayList;
import java.util.Iterator;

import tictactoe.Board;
import tictactoe.Field;

/**
 * @author Florian Naef
 * @author Filip Vrlec
 * 
 *         This class serves the memento pattern.
 */
public class BoardState {
	// Attributes
	private ArrayList<Field> fields = new ArrayList<Field>();

	// Constructor
	/**
	 * @param fields adds fields to this state
	 */
	public BoardState(Board board) {
		copyField(board.getFieldsL());
		
	}

	public ArrayList<Field> copyField(ArrayList<Field> f) {
		final ArrayList<Field> copy = new ArrayList<Field>();
		Iterator<Field> iterate = f.iterator();
		while (iterate.hasNext()) {
			copy.add(iterate.next());
		}
		
		return copy;
	}

	// Getters and Setters
	/**
	 * @return the fields, which we can then use to get our old state of our board
	 */
	public ArrayList<Field> getFields() {
		return fields;
	}

	/**
	 * @param fields
	 */
	public void setFields(ArrayList<Field> fields) {
		this.fields = fields;
	}


}