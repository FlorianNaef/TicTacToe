package tictactoe;

/**
 * @version 1.0
 * 
 * @author Florian Naef
 * @author Luka Steric
 * @author Filip Vrlec
 * 
 * 
 */
public class Main {

	/**
	 * 
	 * @param args
	 * 
	 *             This is the main method of this programme and is used to launch
	 *             it.
	 */
	public static void main(String[] args) {
		Board board = new Board();
		Control ctrl = new Control();
		Player p1 = new Player("X", 1);
		Player p2 = new Player("O", 2);
		boolean b1;
		boolean b2;

		do {
			board.printBoard(p1);
			do {
				b1 = board.makemove(ctrl.readCommand(), p1);
			} while (!b1);

			board.printBoard(p2);
			do {
				b2 = board.makemove(ctrl.readCommand(), p2);
			} while (!b2);
			
		} while (true);

	}
}
