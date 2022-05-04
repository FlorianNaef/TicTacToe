package tictactoe;

/**
*/
public class Board {
	private String a=" ", b=" ", c=" ", d=" ", e=" ", f=" ", g=" ", h=" ", i=" ";

	
	public void makemove(boolean who, String where) {
		// who -> 0 = Spieler 1   1 = Spieler 2
		
		if(who == false) {
			switch(where) {
			case "a":
				a = "x";
				break;
			case "b":
				b = "x";
				break;
			case "c":
				c = "x";
				break;
			case "d":
				d = "x";
				break;
			case "e":
				e = "x";
				break;
			case "f":
				f = "x";
				break;
			case "g":
				g = "x";
				break;
			case "h":
				h = "x";
				break;
			case "i":
				i = "x";
				break;
			}
		}else {
			switch(where) {
			case "a":
				a = "o";
				break;
			case "b":
				b = "o";
				break;
			case "c":
				c = "o";
				break;
			case "d":
				d = "o";
				break;
			case "e":
				e = "o";
				break;
			case "f":
				f = "o";
				break;
			case "g":
				g = "o";
				break;
			case "h":
				h = "o";
				break;
			case "i":
				i = "o";
				break;
			}
		}
	}
	
	public void printBoard() {
		System.out.printf("  A   B   C \n");
		System.out.printf("0 %s | %s | %s \n", a, b, c);
		System.out.printf(" -- + - + -- \n");
		System.out.printf("1 %s | %s | %s \n", d, e, f);
		System.out.printf(" -- + - + -- \n");
		System.out.printf("2 %s | %s | %s \n", g, h, i);
	}
}
