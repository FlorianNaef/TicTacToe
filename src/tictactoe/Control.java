package tictactoe;

import java.util.Scanner;

public class Control {

	Scanner myObj = new Scanner(System.in);

	public String readCommand() {
		System.out.printf("Komando: ");
		String command = myObj.nextLine();
		System.out.printf("\n");
		return command.toUpperCase();
	}

}
