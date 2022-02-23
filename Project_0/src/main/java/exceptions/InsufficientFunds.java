package exceptions;

public class InsufficientFunds extends Exception {
	public String getMessage() {
		return "Currently you dont have enough money for this transactions.";
	}
}
