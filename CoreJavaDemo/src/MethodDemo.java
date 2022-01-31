import java.util.Scanner;

public class MethodDemo {
	
	public static int squareOfANumber(int num) {
		//process
		int ans = num*num;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a number to be squared");
		int input = (sc.nextInt());
		sc.close();
			//System.out.println(input);
			//method invocation
			int myAnswer = squareOfANumber(input);
			//output
			System.out.println("The Square of :" + input +" is:  " + myAnswer);
	}

}
