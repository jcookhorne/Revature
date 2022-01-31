package arrays;

import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [][] matrixA = new int[2]  [3];
		
		matrixA[0] [0] = 10;
		matrixA[0] [1] = 20;
		matrixA[0] [2] = 30;
		matrixA[1] [0] = 40;
		matrixA[1] [1] = 50;
		matrixA[1] [2] = 60;
		
			for (int i= 0; i<matrixA.length; i++) {
				for (int j= 0; j<matrixA[i].length; j++ ) {
					System.out.print(matrixA[i][j] + "  ");
				}
				System.out.println();
			}
			
			
			// initialize an array\
			int [] [] matrixB = {{70, 80, 90}, {100,110, 120}};
			for (int t= 0; t<matrixB.length; t++) {
				for (int v= 0; v<matrixB[t].length; v++ ) {
					System.out.print(matrixB[t][v] + "  ");
				}
				System.out.println();
			}
			int d = 0;
			/// initialize an array
			int [] scores = new int [5];
			for( d = 0; d<scores.length;d++) {
				scores[d] = sc.nextInt();
				
			}
			//System.out.print(scores[d] - 1);
			
				
		}

}
