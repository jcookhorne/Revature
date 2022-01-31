package arrays;

public class OneArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade1 = 20;
		int grade2 = 30;
		
		//int[] myGrades // declared an int array variable
		//myGrades = new int[5];
		// combining into a single line
		
		int[] myGrades = new int [5]; 
		myGrades[0] = 40;
		myGrades[1] = 30;
		myGrades[2] = 60;
		myGrades[3] = 70;
		myGrades[4] = 20;
		 for (int i=0; i<myGrades.length; i++) {
			 System.out.println(myGrades[i]);
		 }
	
	}

}
