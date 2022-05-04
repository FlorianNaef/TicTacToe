package tictactoe;

/**
*/
public class Board {
	
	
	private String fields[] = {" "," "," "," "," "," "," "," "," "};

	boolean spieler = false;

	public void setSpieler(boolean spieler) {
		this.spieler = spieler;
	}
	
	public String[] getFields() {
		return fields;
	}
	
	

	public void makemove(String where) {
		// who -> 0 = Spieler 1 1 = Spieler 2

		if (spieler == false) {
			switch (where) {
			case "A0":
				fields[0] = "x";
				break;
			case "B0":
				fields[1] = "x";
				break;
			case "C0":
				fields[2] = "x";
				break;
			case "A1":
				fields[3] = "x";
				break;
			case "B1":
				fields[4] = "x";
				break;
			case "C1":
				fields[5] = "x";
				break;
			case "A2":
				fields[6] = "x";
				break;
			case "B2":
				fields[7] = "x";
				break;
			case "C2":
				fields[8] = "x";
				break;
			}
		} else {
			switch (where) {
			case "A0":
				fields[0] = "o";
				break;
			case "B0":
				fields[1] = "o";
				break;
			case "C0":
				fields[2] = "o";
				break;
			case "A1":
				fields[3] = "o";
				break;
			case "B1":
				fields[4] = "o";
				break;
			case "C1":
				fields[5] = "o";
				break;
			case "A2":
				fields[6] = "o";
				break;
			case "B2":
				fields[7] = "o";
				break;
			case "C2":
				fields[8] = "o";
				break;
			}
		}
		spieler = !spieler;
	}

	public void printBoard() {
		System.out.printf("  A   B   C \n");
		System.out.printf("0 %s | %s | %s \n", fields[0], fields[1], fields[2]);
		System.out.printf(" -- + - + -- \n");
		System.out.printf("1 %s | %s | %s \n", fields[3], fields[4], fields[5]);
		System.out.printf(" -- + - + -- \n");
		System.out.printf("2 %s | %s | %s \n", fields[6], fields[7], fields[8]);
	}
}
