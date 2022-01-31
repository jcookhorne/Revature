package arrayassignments;

import java.util.Arrays;
import java.util.Scanner;

public class PresentNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print number of times an element is present in an array(every element
		// 10- 3    20 -2    30 -1 40 - 1 50 -1        Expected output
			
		Scanner sc = new Scanner(System.in);
		int count = 1;
		//int num [] = {0};
	
		int arr[] = new int [6];
		//int repeatedArr = new int [arr.length];
		arr[0] = 2;
		arr[1] = 2;
		arr[2] = 1;
		arr[3] = 4;
		arr[4] = 6;
		arr[5] = 4;
			Arrays.sort(arr);
			for(int i = 0; i < arr.length; i++) {
				//arr[i] = sc.nextInt();
				for(int j = 0; j < arr.length; j++) {
					
				if (arr[j] == arr[i]) {
					count++;
				} else {
					break;
				}					
				System.out.println(arr[i] + " " +count);
				}
					
		
				
			}
			//System.out.print(count);
			//System.out.println(Arrays.toString(arr));
			//System.out.print(arr[i] + count);
			/* num= 0;
			 * for(int i = 0; i < arr.length; i++) {
			 * If (num = arr[i]){
			 * count++
			 * }
			 * return count
			 */
	}

	
}
