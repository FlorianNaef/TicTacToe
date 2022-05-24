package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tictactoe.Field;

class FieldTest {
	Field f;

	@BeforeEach
	void setUp() {
		f = new Field();
	}

	@AfterEach
	void tearDown() {
		f = null;
	}

	@Test
	void checkIfValueSetTest1() {
		assertEquals(false, f.checkIfValueSet());
	}

	@Test
	void checkIfValueSetTest2() {
		f.setUnsetValue("X");
		assertEquals(true, f.checkIfValueSet());
	}

	@Test
	void checkIfValueSetTest3() {
		f.setUnsetValue("O");
		assertEquals(true, f.checkIfValueSet());
	}

	@Test
	void setUnsetValueTest1() {
		assertEquals(true, f.setUnsetValue(""));
	}

	@Test
	void setUnsetValueTest2() {
		f.setUnsetValue("");
		assertEquals(false, f.setUnsetValue(""));
	}

	@Test
	void toStringTest1() {
		assertEquals(" ", f.toString());
	}

	@Test
	void toStringTest2() {
		f.setUnsetValue("X");
		assertEquals("X", f.toString());
	}

	@Test
	void toStringTest3() {
		f.setUnsetValue("O");
		assertEquals("O", f.toString());
	}
}
