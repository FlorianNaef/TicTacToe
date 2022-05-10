package tictactoe;

/**
*/
public class Board {

	private Field[] fields;
	boolean spieler = false;

	public Board() {
		fields = new Field[9];
		for (int i = 0; i <= 8; i++) {
			fields[i] = new Field();
		}

	}

	public void setSpieler(boolean spieler) {
		this.spieler = spieler;
	}

	public Field[] getFields() {
		return fields;
	}

	public boolean makemove(String where, Player p) {

		switch (where) {
		case "A0":
			return fields[0].setUnsetValue(p.getSymbol());
		case "B0":
			return fields[1].setUnsetValue(p.getSymbol());
		case "C0":
			return fields[2].setUnsetValue(p.getSymbol());
		case "A1":
			return fields[3].setUnsetValue(p.getSymbol());
		case "B1":
			return fields[4].setUnsetValue(p.getSymbol());
		case "C1":
			return fields[5].setUnsetValue(p.getSymbol());
		case "A2":
			return fields[6].setUnsetValue(p.getSymbol());
		case "B2":
			return fields[7].setUnsetValue(p.getSymbol());
		case "C2":
			return fields[8].setUnsetValue(p.getSymbol());

		default:
			System.out.printf("Try again with a valid value\n");
			return false;
		}

	}

	public void printBoard(Player p) {
		System.out.printf("  A   B   C \n");
		System.out.printf("0 %s | %s | %s \n", fields[0], fields[1], fields[2]);
		System.out.printf(" -- + - + -- \n");
		System.out.printf("1 %s | %s | %s \n", fields[3], fields[4], fields[5]);
		System.out.printf(" -- + - + -- \n");
		System.out.printf("2 %s | %s | %s \n", fields[6], fields[7], fields[8]);
		System.out.printf("Spieler %s | %s\n\n", p.getNumber(), p.getSymbol());
	}
}
