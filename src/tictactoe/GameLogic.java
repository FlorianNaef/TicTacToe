package tictactoe;

import java.util.ArrayList;

import tictactoe.memento.History;

/**
 * 
 * @author filip This class will check if the game is solved or not
 */
public class GameLogic {
	// Attributes
	Board b;
	ArrayList<Player> ps;
	private Field[] f;

	// Constructor
	public GameLogic(Board b, Player p1, Player p2) {
		this.b = b;
		ps = new ArrayList<Player>();
		ps.add(p1);
		ps.add(p2);
		this.f = b.getFields();

	}

	// Methods
	public Board playerMoves(Board board, Player p, Control ctrl) {
		boolean b = false;
		board.printBoard(p);
		do {
			b = board.makemove(ctrl.read("Command"), p);
		} while (!b);
		return board;
	}

	public String checkVertical() {
		for (Player p : ps) {
			for (int i = 0; i < 3; i++) {
				if (f[0 + i].getValue() == p.getSymbol() && f[3 + i].getValue() == p.getSymbol()
						&& f[6 + i].getValue() == p.getSymbol()) {
					return "Player " + p.getNumber() + " won";
				}
			}
		}
		return "nobodyV";
	}

	public String checkHorizontal() {
		for (Player p : ps) {
			for (int i = 0; i < 9; i += 3) {
				if (f[0 + i].getValue() == p.getSymbol() && f[1 + i].getValue() == p.getSymbol()
						&& f[2 + i].getValue() == p.getSymbol()) {
					return "Player " + p.getNumber() + " won";
				}
			}
		}
		return "nobodyH";
	}

	public String checkDiagonal() {
		for (Player p : ps) {
			if (f[0].getValue() == p.getSymbol() && f[4].getValue() == p.getSymbol()
					&& f[8].getValue() == p.getSymbol()) {
				return "Player " + p.getNumber() + " won";
			}
			if (f[2].getValue() == p.getSymbol() && f[4].getValue() == p.getSymbol()
					&& f[6].getValue() == p.getSymbol()) {
				return "Player " + p.getNumber() + " won";
			}
		}
		return "nobodyD";
	}
}
