package control_loop_assignment;

import java.util.Scanner;

public class SumOfDigits {
	public static void sumOfDigits() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int num1 = sc.nextInt();
		int sum = 0;
			while(num1 != 0) {
				sum = sum +num1%10;
				num1=num1/10;
			}
			System.out.println(sum);

	}
	
	public static void main(String[] args) {
		
		
		
	}

}
