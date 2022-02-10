package functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalInterfaceAssignments {
	public static void main(String[] args) {

		// program 1) compute the cube of a number
		Function<Integer, Integer> cube = (num) -> num * num * num;
		int ans = cube.apply(3);
		System.out.println("Answer is : " + ans);

		// program 2) compute base ppwer number
		BiFunction<Integer, Integer, Integer> power = (base, pow) -> (int)Math.pow(base, pow);
		int ans2 = power.apply(4, 5);
		System.out.println(ans2);
	
		// program3) Program to check if a number is odd or eve
		Function<Integer, Boolean>evenOdd = (num2) -> {
			
			if(num2%2 ==0) {
				return true;
			}else 
				return false;
		};
		Boolean ans3 = evenOdd.apply(7);
		System.out.println("If the number is even it will be true if it is false it was odd.");
		System.out.println("Answer is : " + ans3);
		
		
		
		
		
		// program 4)Program to generate a random number
		Function<Double, Integer> rand = (num3) ->{
			
			int random = (int) Math.floor((Math.random()* 100) + 1);
			
			return random;
		};
		int ans4 = rand.apply(null);
		System.out.println("your random number between 1 and 100 is : " + ans4);
	
	
		//program to print the elements of an array
		Function<Integer, String> arr = (num4) ->{
			int[] arr1 = new int [3];
			arr1 [0] = 10;
			arr1 [1] = 20;
			arr1 [2] = 40;
			for(int i= 0; i<arr1.length; i++) {
				 System.out.print( arr1[i] + " ");
			}
			System.out.println();
			return "" ;
		};
		System.out.println("Your array is : " );
		String ans5 = arr.apply(0);
		//System.out.println("Your array is : " + ans5);
		
		
		
		
		
		//Program to add two matrices
		Function<Integer , String> matr =(num5) ->{
			int [] [] matrixA = {{2,15}, {2,4}};
			int [] [] matrixB = {{2,89}, {2,9}};
			int [] [] matrixC = new int [2][2];
			for(int t=0; t<2; t++) {
				for (int j = 0; j<2; j++) {
					matrixC[t][j] = matrixA[t][j] + matrixB[t][j];
					System.out.print( matrixC[t][j] + " ");
				}
				System.out.println();
			}
			
			return "";
			
		};
		System.out.println("The sum of the matrix's are : ");
		String ans6 = matr.apply(0);
		//System.out.println("The sum of the Matrices are : " + ans6);
		

		//Program to find the factorial of a number
		Function<Integer, Integer> fact = (num7) ->{
			
			int n = 1;
			for(int i = num7; i>0; i-- ) {
				n = n* i;
			}
			return n;
		};
		
		
		int ans7 = fact.apply(5);
		System.out.println("factorial of your numeber :  " + ans7);
	
		
		//Program to check if the first string is a 
		//substring of the second string
		BiFunction<String,String, Boolean> sub = (str1, str2) ->{
			
			if (str2.indexOf(str1) == -1)
			return false;
			else 
			return true;
			
		};
		
		boolean ans8 = sub.apply("llo", "hello");
		System.out.println("If the string is true then the first string is a substring of the second : ");
		System.out.println("The answer is : " + ans8);
	}
}
