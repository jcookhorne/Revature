package arrayassignments;

// you did these wrong you were supposed to add each column together for the matrices

public class MatrixAddition {
	
	public static int matrixsAdd(int sum) {
		
		sum = 0;
		int matrix [] [] = new int [2]  [2];
		matrix [0][0] = 10;
		matrix [0][1] = 20;
		matrix [1][0] = 30;
		matrix [1][1] = 40;
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j<matrix[i].length; j++) {
				System.out.println(matrix[i][j]);
				sum = sum + matrix[i][j];
				
			}
		}
		return sum;
	}

	// add 2 matrix's together
	
	
	public static void main(String[] args) {
	int sum = 0;
	System.out.println(matrixsAdd(sum));
		
	}
	
	
}
