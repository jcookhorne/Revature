package arrayassignments;

public class IrregularArray {
	public static void main(String[] args) {
		
		// 
		// array has 3 rows but we have no idea how big the columns are
		 // you hvae to manually enter them and so first row has 2 columns within it
		 // 2nd one has 4
		 // last one only has 1 column
		int [][] irr = new int [3][];
		irr[0] = new int [3]; 
		irr[1] = new int [4];
		irr[2] = new int [2];

		int count = 0;
		for(int i= 0; i< irr.length; i++) {
			for (int j = 0; j < irr[i].length; j++) {
				irr[i][j] = count++;
				
				
			}
		}
		System.out.println("Contents of irregular array");
	        for (int i = 0; i < irr.length; i++) {
	            for (int j = 0; j < irr[i].length; j++)
	                System.out.print(irr[i][j] + " ");
	            System.out.println();
			}
		}
			
	     
	
	}


