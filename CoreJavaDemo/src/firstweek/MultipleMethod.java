package firstweek;
import java.util.Scanner;

public class MultipleMethod {
	
	public static int cube(int num) {
		int ans = num*num*num;
		return ans;
	}
	public static double half(double num) {
		double ansH = num / 2;
		return ansH;
	}
	public static double cels(double num) {
		double ansC = (num-32) * 1.8;
		return ansC;
	}
	public static int kilo(int num) {
		int ansK = num *1000;
		return ansK;
	}
	public static int linked(char let ) {
		char ch= let;
		int ansLi = (int)ch;
		return ansLi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input for all 5 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to be cubed");
		int cube = sc.nextInt();
		
		System.out.println("Please enter a number to be halfed");
		double half = sc.nextDouble();
		
		System.out.println("Please enter a number to be converted to Fahrenheit from Celsius");
		double cels = sc.nextDouble();
		
		System.out.println("Please enter a number to be converted to meters from KiloMeters");
		int kilo = sc.nextInt();
		
		System.out.println("Please enter a character that you want the ascii of");
		char link = sc.next().charAt(0);
		sc.close();
		//all calling all 5 methods
		int cubeAns = cube(cube);
		double halfAns = half(half);
		double celsAns = cels(cels);
		int kiloAns = kilo(kilo);
		int linkAns = linked(link);
			
		// output all 5 methods
		System.out.println("The cube of your number is : " + cubeAns);
		System.out.println("The number cut in half is : " + halfAns);
		System.out.println("The number converted from celsius to Fahrenheit is : " + celsAns);
		System.out.println("The number you converted from kilometers to meters is :" + kiloAns);
		System.out.println("The ascii number of the character is : " + linkAns);
		
	}

}
