package flow_control_and_loops;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program to check if a number is greater than 10
		// input
		/* uncomment this to use what is below it lol
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number ");
		int numCheck = sc.nextInt();
		if(numCheck > 25 ) {
			System.out.println("How could you I trusted you and you put in a number that is larger than 20 omg!!!");
			
		}else {
			System.out.println("You call yourself and adventurer and yet you refuse to test the limits and the bounds despicable.");
			
			
		}
		*/
		
		// program to check if a number is less than 0 or between 1 and 100 or greater than 100
		// input
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number ");
		int numCheck = sc.nextInt();
		if (numCheck < 0) {
			System.out.println(numCheck +" is less than 0");
		}else if(numCheck >= 1 && numCheck <=100) {
			System.out.println(numCheck + " is between 1 and 100");
		}else if (numCheck > 100) {
			System.out.println(numCheck + " is greater than 100");
		}
	}

}
