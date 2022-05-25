package tictactoe.memento;

import java.util.ArrayList;

/**
 * 
 * @author Filip Vrlec
 * @author Luka Steric
 *
 *         This class is a part of the memento patter and will help with the
 *         undo function.
 */
public class History {
	// Attributes
	private ArrayList<BoardState> states = new ArrayList<BoardState>();

	// Methods
	/**
	 * @param state board state added to the array list
	 * 
	 *              This method adds a state to the array list.
	 */
	public void push(BoardState state) {
		states.add(state);
		System.out.printf("Pushing\n");
	}

	/**
	 * @return last state of the board
	 * 
	 *         This methods goes back a state and returns it.
	 */
	public BoardState pop() {
		int lastIndex = states.size() - 1;
		BoardState lastState = states.get(lastIndex);

		if (lastIndex >= 0) {
			states.remove(lastState);
		}
		return lastState;
	}
}