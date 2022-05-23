package tictactoe.memento;

import java.util.ArrayList;

public class History {
	// Attributes
	private ArrayList<BoardState> states = new ArrayList<BoardState>();

	// Methods
	public void push(BoardState state) {
		states.add(state);
	}

	public BoardState pop() {
		int lastIndex = states.size() - 1;
		BoardState lastState = states.get(lastIndex);
		states.remove(lastState);
		return lastState;
	}
}
