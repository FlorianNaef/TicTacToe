package tictactoe;

import java.util.Scanner;

public class Steuerung {
	
	Scanner myObj = new Scanner(System.in);
	
	public String komandoEinlesen() {
		System.out.printf("Komando: ");
		String komando = myObj.nextLine();
		return komando;		
	}
}
