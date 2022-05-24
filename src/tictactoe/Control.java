package tictactoe;

import java.util.Scanner;

/**
 * @author Luka Steric
 *
 *         This class covers the input and output aspect.
 */
public class Control {
	// Attributes
	private Scanner myObj = new Scanner(System.in);

	// Methods
	/**
	 * @param s the text displayed
	 * @return the command the player gives, but converted to upper case letters
	 * 
	 *         This method prints text, asks for an input and returns the input as a
	 *         string in all upper case letters.
	 */
	public String read(String s) {
		System.out.printf("%s: ", s);
		String command = myObj.nextLine();
		System.out.printf("\n");
		return command.toUpperCase();
	}

}