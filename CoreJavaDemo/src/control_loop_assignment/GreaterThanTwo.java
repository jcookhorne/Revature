package control_loop_assignment;

import java.util.Scanner;

public class GreaterThanTwo {
public static int greaterOfTwo(int num1, int num2) {
	
	
		int noth =0;
		if(num1>num2) {
			System.out.println("This is the greater number : " + num1);
			return num1;
		}else if(num1<num2) {	
			System.out.println("This is the greater number : " + num2);
			return num2;
		}else {
			System.out.println("Error you have entered the same numbers");
			return noth;
		}
		
	}
	public static void main(String[] args) {
		// input
		//Print the greater of 2 numbers
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter the first number");
				int num1 = sc.nextInt();
				System.out.println("Please enter the second number");
				int num2 = sc.nextInt();
				sc.close();
		// TODO Auto-generated method stub
				
				
				//output
				 greaterOfTwo(num1, num2);
				

	}

}
