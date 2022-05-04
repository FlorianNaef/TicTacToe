package tictactoe;

/**
 * @version 1.0
 * @author Filip Vrlec, Florian Naef
 */
public class Main {
	
	public static void main(String[] args) {
		Board board = new Board();
		Steuerung steuerung = new Steuerung();
		
		board.printBoard();
		board.makemove(false, steuerung.komandoEinlesen());
		board.printBoard();;
	}

}
