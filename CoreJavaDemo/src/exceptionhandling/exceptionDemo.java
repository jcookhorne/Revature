package exceptionhandling;

public class exceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		int num2 = 0;
		int result = 0;
		System.out.println("Going to divide . . . .");
		// 1. JCVm identifies the type of exception  - ArithmeticException
		// 2. JVM creates object of ArithmeticException
		// 3. JVM throws the exception object
		
		try {
		result = num1/num2;
		}catch(ArithmeticException ae) {
			System.out.println("the second number cannot be 0. changing it to 1  . . .");
			result = num1 / 1;
		}
		
		System.out.println("Result is : " + result);
		
		System.out.println("division is over . . . ");
		
	}

}
