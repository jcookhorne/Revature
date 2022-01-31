package arrayassignments;


public class MatrixMultiplication {
	
	public static int matrixMultiply(int product) {
		// multiply two matrix's 
		
				int sum1 = 1;
				int matrix [] [] = new int [2]  [2];
				matrix [0][0] = 5;
				matrix [0][1] = 2;
				matrix [1][0] = 2;
				matrix [1][1] = 2;
				for (int i = 0; i < matrix.length; i++) {
					for(int j = 0; j<matrix[i].length; j++) {
						System.out.println(matrix[i][j]);
						sum1 = sum1 * matrix[i][j];
						
					}
				}
				//System.out.println(sum1);
				return sum1;
				
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product = 1;
		
		// multiply two matrix's 
		
	System.out.println(matrixMultiply(product));
		
	}

}


