package tictactoe;

import java.util.ArrayList;
import java.util.Iterator;

import tictactoe.memento.BoardState;

/**
 * @author Florian Naef
 * @author Luka Steric
 * @author Filip Vrlec
 *
 *         A board is made up of fields, which have a specific value. This class
 *         covers the setting of the fields, drawing of the fields and the
 *         memento.
 */
public class Board {
	// Attributes
	private Field[] fields;
	private ArrayList<Field> fs = new ArrayList<Field>();

	// Constructor
	/**
	 * This constructor initialises the fields, so we don't have a null pointer
	 * exceptions. The fields are empty at first.
	 */
	public Board() {
		fields = new Field[9];
		for (int i = 0; i <= 8; i++) {
			fs.add(new Field());
		}
	}

	// Getters and setters
	/**
	 * @return the whole array of fields
	 */
	public Field[] getFields() {
		return fields;
	}

	public ArrayList<Field> getFieldsL() {
		return this.fs;
	}

	public Field getFieldsL(int i) {
		return this.fs.get(i);
	}

	/**
	 * @return the whole array of fields
	 */
	public Field getField(int i) {
		return fields[i];
	}

	/**
	 * @param i determins the field by the index chosen
	 * @param f sets the value of the field
	 */
	public void setFields(int i, Field f) {
		this.fields[i] = f;
	}

	public void setFieldsL(ArrayList<Field> al) {
		this.fs = al;
	}

	// Methods
	/**
	 * @param where indicates in which field a value should be placed in
	 * @param p     is used to get the value (X or O)
	 * @return boolean which indicates if a command has successfully been run
	 * 
	 *         This method sets the chosen field to the player's value. If not
	 *         written correctly, it won't work.
	 */
	public boolean makemove(String where, Player p) {

		switch (where) {
		case "A0":
			return fs.get(0).setUnsetValue(p.getSymbol());
		case "B0":
			return fs.get(1).setUnsetValue(p.getSymbol());
		case "C0":
			return fs.get(2).setUnsetValue(p.getSymbol());
		case "A1":
			return fs.get(3).setUnsetValue(p.getSymbol());
		case "B1":
			return fs.get(4).setUnsetValue(p.getSymbol());
		case "C1":
			return fs.get(5).setUnsetValue(p.getSymbol());
		case "A2":
			return fs.get(6).setUnsetValue(p.getSymbol());
		case "B2":
			return fs.get(7).setUnsetValue(p.getSymbol());
		case "C2":
			return fs.get(8).setUnsetValue(p.getSymbol());

		default:
			System.out.printf("Try again with a valid value\n");
			return false;
		}
	}

	/**
	 * @param p uses the values of the player to show whose turn it is
	 *
	 *          This method draws the whole board in the console.
	 */
	public void printBoard(Player p) {
		System.out.printf("  A   B   C \n");
		System.out.printf("0 %s | %s | %s \n", fs.get(0), fs.get(1), fs.get(2));
		System.out.printf(" -- + - + -- \n");
		System.out.printf("1 %s | %s | %s \n", fs.get(3), fs.get(4), fs.get(5));
		System.out.printf(" -- + - + -- \n");
		System.out.printf("2 %s | %s | %s \n", fs.get(6), fs.get(7), fs.get(8));
		System.out.printf(" -- + - + -- \n");
		System.out.printf("\nSpieler %s | %s\n\n", p.getNumber(), p.getSymbol());
	}

	/**
	 * @return the current state of the board
	 */
	public BoardState createMemento() {
		System.out.printf("Create Memento \n");
		return new BoardState(this);
	}

	/**
	 * @param state uses the state to jump back (undo)
	 */
	public void restore(BoardState state) {

		fs = null;
		fs = new ArrayList<Field>();
		Iterator<Field> iterate = state.getFields().iterator();
		//while (iterate.hasNext()) {
		//	fs.add(iterate.next());
		//}
		for (int i = 0; i < 9; i++) {
			fs.add(iterate.next());
		}
	}

}