package tictactoe;

public class Field {
	private String value = " ";

	public String getValue() {
		return this.value;
	}

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
