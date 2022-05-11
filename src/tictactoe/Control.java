package tictactoe;

import java.util.Scanner;

/**
 * 
 * @author Luka Steric
 *
 */
public class Control {
	// Attributes
	private Scanner myObj = new Scanner(System.in);

	// Methods
	public String readCommand() {
		System.out.printf("Komando: ");
		String command = myObj.nextLine();
		System.out.printf("\n");
		return command.toUpperCase();
	}

}
