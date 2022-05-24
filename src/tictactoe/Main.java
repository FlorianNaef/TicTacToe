package tictactoe;

import java.util.Scanner;

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

	/*
	 * Todo: Game over variabel neustart einfügen visibilität
	 */

	/**
	 * 
	 * @param args
	 * 
	 *             This is the main method of this programme and is used to launch
	 *             it.
	 */
	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		boolean gameloop = true;

		do {

			Player[] p = new Player[2];
			p[0] = new Player("X", 1);
			p[1] = new Player("O", 2);
			Board board = new Board();
			Control ctrl = new Control();
			GameLogic gl;
			Timer timer = new Timer();
			History history = new History();
			history.push(board.createMemento());
			boolean gameover = false;

			timer.startTime();
			do {

				gl = new GameLogic(board, p[0], p[1]);
				for (int i = 0; i < 2; i++) {

					p[i].startTime();
					board = gl.playerMoves(board, p[i], ctrl);
					p[i].stopTime();
					// board.restore(history.pop());

					if (gl.checkVertical() != "nobodyV" || gl.checkHorizontal() != "nobodyH"
							|| gl.checkDiagonal() != "nobodyD") {
						board.printBoard(p[i]);
						System.out.printf("Player %s won the game\n", p[i].getNumber());
						gameover = true;
						break;
					}
				}

			} while (!gameover);

			timer.stopTime(true);

			System.out.printf("\n Enter 'New' for new Game, 'End' to exit the game or 'Undo' to undo your last move\n");
			String command = myObj.nextLine();
			System.out.printf("\n");
			command.toUpperCase();
			switch (command) {
			case "NEW":
				gameloop = true;
				break;
			case "END":
				gameloop = false;
				break;
			case "UNDO":
				// undo;
				gameover = false;
				break;
			}

		} while (gameloop);

	}
}