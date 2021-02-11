package checkedException;

public class InvalidInputValueException extends Exception {
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidInputValueException() {
		super("Invalid Input Value is found.");
	}
	
	public InvalidInputValueException(String errorMsg) {
		super(errorMsg);
	}
}
