package flow_control_and_loops;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program to check if a char is a vowel or not
		
		//input
		Scanner sc = new Scanner(System.in);
		System.out.println("choose a char");
		char nextChar = sc.next().charAt(0);
		String output = "";
		
		
		switch(nextChar) {
		case 'a', 'e', 'i', 'o', 'u':
			output = "Vowel";
			break;
	
		/*case 'e':
			output = "Vowel";
			break;
		case 'i':
			output = "Vowel";
			break;
		case 'o':
			output = "Vowel";
			break;
		case 'u':
			output = "Vowel";
			break;
			*/
		default : 
			output = "No vowels here my boi";
		
		}
		System.out.println(output);
	}

}
