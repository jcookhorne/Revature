package exceptionhandling;

public class InvalidOptionException extends RuntimeException {
	
	int menuOption;
	
	
	
	public InvalidOptionException(int menuOption) {
		super();
		this.menuOption = menuOption;
	}

	public String getMessage() {
		return menuOption + "Is not a valid option. Please enter a valid optino!";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
