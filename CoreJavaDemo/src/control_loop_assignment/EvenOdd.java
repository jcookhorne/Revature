package control_loop_assignment;

import java.util.Scanner;

public class EvenOdd {

	public static String evenOdd(int num1) {
		if (num1%2 == 0) {
			return ("The number you entered is even : " + num1) ;
		}else if (num1%2 != 0) {
			 return("The number you entered is odd  : " + num1) ;
			
		}else {
			return"";
		}
			
}
	public static void main(String[] args) {
		System.out.println("Please enter number and I will tell you if its odd or even!!");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		//output
		System.out.println(evenOdd(num1));
		// TODO Auto-generated method stub

	}

}
