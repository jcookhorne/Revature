package exceptionhandling;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 2;
		int num = 5;
		int num2 = 0;
		int result = 0;
		int[] marks = new int[5];
		
		try {
		if (option == 1) {
			result = num/num2;
			
		}else if (option == 2) {
			System.out.println(marks[10]);
			
		}}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println(aiob.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Over . . .");
		
		
	}

}
