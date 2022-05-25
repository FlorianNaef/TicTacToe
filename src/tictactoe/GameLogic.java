package tictactoe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Filip Vrlec
 *
 *         This class will check if the game is solved or not and contains a few
 *         more logic related methods.
 */
public class GameLogic {
	// Attributes
	private Board b;
	private ArrayList<Player> ps;
	private ArrayList<Field> fs = new ArrayList<Field>();;

	// Constructor
	/**
	 * @param b  sets the board to the one chosen
	 * @param p1 sets the player 1, which will be added to the arraylist
	 * @param p2 sets the player 2, which will be added to the arraylist
	 */
	public GameLogic(Board b, Player p1, Player p2) {
		this.b = b;
		ps = new ArrayList<Player>();
		ps.add(p1);
		ps.add(p2);
		this.fs = b.getFieldsL();
	}

	// Methods
	/**
	 * @param board uses the board given
	 * @param p     uses the player to set the value (X or O)
	 * @param ctrl  uses control to add user input
	 * @return updated board
	 *
	 *         This method get the user input, asks for user input if it is invalid,
	 *         makes changes and returns the updated board.
	 */
	public Board playerMoves(Board board, Player p, Control ctrl) {
		boolean b = false;
		board.printBoard(p);
		do {
			b = board.makemove(ctrl.read("Command"), p);
		} while (!b);
		return board;
	}
	
	
	int cool = 0;
	public boolean gameloop(){
		
		boolean gameloop = false;
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.printf("\n Enter 'New' for new Game, 'End' to exit the game or 'Undo' to undo your last move\n");
			String command = myObj.nextLine();
			System.out.printf("\n");
			command = command.toUpperCase();
			switch (command) {
				case "NEW":
					gameloop = true;
					break;
				case "END":
					gameloop = false;
					break;
				case "UNDO":
					// pop();
					break;
				default:
					gameloop();
					break;
			}
		
		return gameloop;
	}

	/**
	 * @return the result of the game ("nobodyV" = nobody has won the game, "Player
	 *         " + p.getNumber() + " won" = the game is won)
	 *
	 *         This method checks if the game has been won by placing three same
	 *         symbols vertically. This has been done by using for each loop and a
	 *         for loop, which checks every field.
	 */
	public String checkVertical() {
		for (Player p : ps) {
			for (int i = 0; i < 3; i++) {
				if (fs.get(0 + i).getValue() == p.getSymbol() && fs.get(3 + i).getValue() == p.getSymbol()
						&& fs.get(6 + i).getValue() == p.getSymbol()) {
					return "Player " + p.getNumber() + " won";
				}
			}
		}
		return "nobodyV";
	}

	/**
	 * @return the result of the game ("nobodyH" = nobody has won the game, "Player
	 *         " + p.getNumber() + " won" = the game is won)
	 *
	 *         This method checks if the game has been won by placing three same
	 *         symbols horizontally. This has been done by using for each loop and a
	 *         for loop, which checks every field.
	 */
	public String checkHorizontal() {
		for (Player p : ps) {
			for (int i = 0; i < 9; i += 3) {
				if (fs.get(0 + i).getValue() == p.getSymbol() && fs.get(1 + i).getValue() == p.getSymbol()
						&& fs.get(2 + i).getValue() == p.getSymbol()) {
					return "Player " + p.getNumber() + " won";
				}
			}
		}
		return "nobodyH";
	}

	/**
	 * @return the result of the game ("nobodyD" = nobody has won the game, "Player
	 *         " + p.getNumber() + " won" = the game is won)
	 *
	 *         This method checks if the game has been won by placing three same
	 *         symbols diagonally. This has been done by using for each loop and by
	 *         using two if statements.
	 */
	public String checkDiagonal() {
		for (Player p : ps) {
			if (fs.get(0 ).getValue() == p.getSymbol() && fs.get(4).getValue() == p.getSymbol()
					&& fs.get(8).getValue() == p.getSymbol()) {
				return "Player " + p.getNumber() + " won";
			}
			if (fs.get(02).getValue() == p.getSymbol() && fs.get(4).getValue() == p.getSymbol()
					&& fs.get(6).getValue() == p.getSymbol()) {
				return "Player " + p.getNumber() + " won";
			}
		}
		return "nobodyD";
	}
}