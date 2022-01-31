package control_loop_assignment;

import java.util.Scanner;

public class FibSeries {
	public static void fibonacciSeries() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int num1 = sc.nextInt();
		int num2 = 0, num3 = 1, sum = 0;
		for(int i = 1; i <= num1; i++) {
			System.out.println(num2);
			sum = num2 + num3;
			num2 = num3;
			num3 = sum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
