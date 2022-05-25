package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tictactoe.Board;
import tictactoe.Field;
import tictactoe.Player;

/**
 * @version 1.0
 * 
 * @author Florian Naef
 * @author Filip Vrlec
 * 
 * This class contains the test-functions for the Board class
 * 
 */
class BoardTest {
	Board b;
	Player[] p;

	@BeforeEach
	void setIp() {
		b = new Board();
		p = new Player[2];
		p[0] = new Player("X", 1);
		p[1] = new Player("O", 2);
	}

	@AfterEach
	void tearDown() {
		b = null;
		p = null;
		p[0] = null;
		p[1] = null;
	}

	@Test
	void makeMove1() {
		b.makemove("A0", p[0]);
		Field f = new Field();
		f = b.getField(0);
		assertEquals("X", f.getValue());
	}

}
