package exceptionhandling;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menuOption = -5;
		try {
		if (menuOption <1 || menuOption>5) {
			
			throw new InvalidOptionException(menuOption);
		}else {
			System.out.println("Valie menu option . . .");
		}}catch(InvalidOptionException ioe) {
			System.out.println(ioe.getMessage());
		}
		
		
		
		
		
	}

}
