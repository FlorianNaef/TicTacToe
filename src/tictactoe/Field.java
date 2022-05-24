package tictactoe;

/**
 * @author Filip Vrlec
 *
 *         This class covers the field. A field is a spot in the board and has
 *         only one attribute; the value, which can be either blank (" ") or set
 *         ("X" or "O").
 */
public class Field {
	// Attributes
	private String value = " ";

	// Getter
	/**
	 * @return the value of the field
	 */
	public String getValue() {
		return this.value;
	}

	// Methods
	/**
	 * @return boolean, which tells us if the value has been set
	 */
	public boolean checkIfValueSet() {
		if (this.value == " ") {
			return false;
		}
		return true;
	}

	/**
	 * @param value sets the value of the field
	 * @return if the value is changed true, if not false
	 * 
	 *         This method checks if the value has been set. If it hasn't, then you
	 *         can change the value and it will return true. If it has been changed,
	 *         you will get a message and it will return false.
	 */
	public boolean setUnsetValue(String value) {
		if (!this.checkIfValueSet()) {
			this.value = value;
			return true;
		} else {
			System.out.printf("Value can not be overwritten!!!!\n");
			return false;
		}
	}

	/**
	 * @return the value of the field
	 * 
	 *         This method converts the object into a string as its value.
	 */
	@Override
	public String toString() {
		return this.value;
	}
}