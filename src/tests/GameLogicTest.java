package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tictactoe.Board;
import tictactoe.GameLogic;
import tictactoe.Player;

/**
 * @version 1.0
 * 
 * @author Florian Naef
 * @author Filip Vrlec
 * 
 * This class contains the test-functions for the GameLogic class
 * 
 */
class GameLogicTest {
	Board b;
	Player[] p;
	GameLogic gl;

	@BeforeEach
	void setup() {
		b = new Board();
		p = new Player[2];
		p[0] = new Player("X", 1);
		p[1] = new Player("O", 2);
		gl = new GameLogic(b, p[0], p[1]);
	}

	@AfterEach
	void tearDown() {
		b = null;
		p = null;
		gl = null;
	}

	@Test
	void checkVerticalTest1() {
		b.makemove("A0", p[0]);
		b.makemove("A1", p[0]);
		b.makemove("A2", p[0]);

		assertEquals("Player 1 won", gl.checkVertical());
	}

	@Test
	void checkVerticalTest2() {
		b.makemove("B0", p[0]);
		b.makemove("B1", p[0]);
		b.makemove("B2", p[0]);

		assertEquals("Player 1 won", gl.checkVertical());
	}

	@Test
	void checkVerticalTest3() {
		b.makemove("C0", p[0]);
		b.makemove("C1", p[0]);
		b.makemove("C2", p[0]);

		assertEquals("Player 1 won", gl.checkVertical());
	}

	@Test
	void checkVerticalTest4() {
		b.makemove("A0", p[0]);
		b.makemove("A2", p[0]);

		assertEquals("nobodyV", gl.checkVertical());
	}

	@Test
	void checkVerticalTest5() {
		b.makemove("B0", p[0]);
		b.makemove("B2", p[0]);

		assertEquals("nobodyV", gl.checkVertical());
	}

	@Test
	void checkVerticalTest6() {
		b.makemove("C0", p[0]);
		b.makemove("C2", p[0]);

		assertEquals("nobodyV", gl.checkVertical());
	}

	@Test
	void checkVerticalTest7() {
		b.makemove("A0", p[0]);
		b.makemove("A1", p[1]);
		b.makemove("A2", p[0]);

		assertEquals("nobodyV", gl.checkVertical());
	}

	@Test
	void checkVerticalTest8() {
		b.makemove("B0", p[0]);
		b.makemove("B1", p[1]);
		b.makemove("B2", p[0]);

		assertEquals("nobodyV", gl.checkVertical());
	}

	@Test
	void checkVerticalTest9() {
		b.makemove("C0", p[0]);
		b.makemove("C1", p[1]);
		b.makemove("C2", p[0]);

		assertEquals("nobodyV", gl.checkVertical());
	}

	@Test
	void checkHorizontalTest1() {
		b.makemove("A0", p[0]);
		b.makemove("B0", p[0]);
		b.makemove("C0", p[0]);

		assertEquals("Player 1 won", gl.checkHorizontal());
	}

	@Test
	void checkHorizontalTest2() {
		b.makemove("A1", p[0]);
		b.makemove("B1", p[0]);
		b.makemove("C1", p[0]);

		assertEquals("Player 1 won", gl.checkHorizontal());
	}

	@Test
	void checkHorizontalTest3() {
		b.makemove("A2", p[0]);
		b.makemove("B2", p[0]);
		b.makemove("C2", p[0]);

		assertEquals("Player 1 won", gl.checkHorizontal());
	}

	@Test
	void checkHorizontalTest4() {
		b.makemove("A0", p[0]);
		b.makemove("C0", p[0]);

		assertEquals("nobodyH", gl.checkHorizontal());
	}

	@Test
	void checkHorizontalTest5() {
		b.makemove("A1", p[0]);
		b.makemove("C1", p[0]);

		assertEquals("nobodyH", gl.checkHorizontal());
	}

	@Test
	void checkHorizontalTest6() {
		b.makemove("A2", p[0]);
		b.makemove("C2", p[0]);

		assertEquals("nobodyH", gl.checkHorizontal());
	}

	@Test
	void checkHorizontalTest7() {
		b.makemove("A0", p[0]);
		b.makemove("B0", p[1]);
		b.makemove("C0", p[0]);

		assertEquals("nobodyH", gl.checkHorizontal());
	}

	@Test
	void checkHorizontalTest8() {
		b.makemove("A1", p[0]);
		b.makemove("B1", p[1]);
		b.makemove("C1", p[0]);

		assertEquals("nobodyH", gl.checkHorizontal());
	}

	@Test
	void checkHorizontalTest9() {
		b.makemove("A2", p[0]);
		b.makemove("B2", p[1]);
		b.makemove("C2", p[0]);

		assertEquals("nobodyH", gl.checkHorizontal());
	}

	@Test
	void checkDiagonal1() {
		b.makemove("A0", p[0]);
		b.makemove("B1", p[0]);
		b.makemove("C2", p[0]);

		assertEquals("Player 1 won", gl.checkDiagonal());
	}

	@Test
	void checkDiagonal2() {
		b.makemove("C0", p[0]);
		b.makemove("B1", p[0]);
		b.makemove("A2", p[0]);

		assertEquals("Player 1 won", gl.checkDiagonal());
	}

	@Test
	void checkDiagonal3() {
		b.makemove("A0", p[0]);
		b.makemove("C2", p[0]);

		assertEquals("nobodyD", gl.checkDiagonal());
	}

	@Test
	void checkDiagonal4() {
		b.makemove("C0", p[0]);
		b.makemove("A2", p[0]);

		assertEquals("nobodyD", gl.checkDiagonal());
	}

	@Test
	void checkDiagonal5() {
		b.makemove("A0", p[0]);
		b.makemove("B1", p[1]);
		b.makemove("C2", p[0]);

		assertEquals("nobodyD", gl.checkDiagonal());
	}

	@Test
	void checkDiagonal6() {
		b.makemove("C0", p[0]);
		b.makemove("B1", p[1]);
		b.makemove("A2", p[0]);

		assertEquals("nobodyD", gl.checkDiagonal());
	}
}
