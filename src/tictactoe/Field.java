package tictactoe;

/**
 * @author Filip Vrlec
 *
 *
 */
public class Field {
	// Attributes
	private String value = " ";

	// Getter
	public String getValue() {
		return this.value;
	}

	// Methods
	public boolean checkIfValueSet() {
		if (this.value == " ") {
			return false;
		}
		return true;
	}

	public boolean setUnsetValue(String value) {
		if (!this.checkIfValueSet()) {
			this.value = value;
			return true;
		} else {
			System.out.printf("Value can not be overwritten!!!!\n");
			return false;
		}
	}

	@Override
	public String toString() {
		return this.value;
	}
}
