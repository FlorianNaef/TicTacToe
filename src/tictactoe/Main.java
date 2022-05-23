package tictactoe;

import tictactoe.memento.History;

/**
 * @version 1.0
 * 
 * @author Florian Naef
 * @author Luka Steric
 * @author Filip Vrlec
 * 
 */
public class Main {
	// Methods
	/**
	 * 
	 * @param args
	 * 
	 *             This is the main method of this programme and is used to launch
	 *             it.
	 */
	public static void main(String[] args) {
		Player[] p = new Player[2];
		p[0] = new Player("X", 1);
		p[1] = new Player("O", 2);
		Board board = new Board();
		Control ctrl = new Control();
		GameLogic gl;
		History history = new History();
		history.push(board.createMemento());

		do {
			gl = new GameLogic(board, p[0], p[1]);
			for (int i = 0; i < 2; i++) {
				board = gl.playerMoves(board, p[i], ctrl);
				history.push(board.createMemento());

				if (gl.checkVertical() != "nobodyV" || gl.checkHorizontal() != "nobodyH"
						|| gl.checkDiagonal() != "nobodyD") {
					System.out.printf("Player %s won the game", p[i].getNumber());
					break;
				}
			}
			if (gl.checkVertical() != "nobodyV" || gl.checkHorizontal() != "nobodyH"
					|| gl.checkDiagonal() != "nobodyD") {
				break;
			}
		} while (true);
	}
}
