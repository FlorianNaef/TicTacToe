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
	public String read(String s) {
		System.out.printf("%s: ", s);
		String command = myObj.nextLine();
		System.out.printf("\n");
		return command.toUpperCase();
	}

}
