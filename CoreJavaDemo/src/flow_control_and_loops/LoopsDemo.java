package flow_control_and_loops;

public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print hello java 10 time to the console
		/*
		int  i=1;
		while(i<=10) {
			System.out.println("Hello Java");
			i++;
		}
	
		int number  = 8;
		int j = 1;
		do {
			System.out.println(j);
			// expression
			j++;
		}while (j <= number);
	
		*/
	// print all even numbers up to N
	int num = 45;
	for(int l = 1; l<=num; l++) {
		if(l%2 == 0) {
			System.out.println(l);
		}
	}
	// another way to do even numbers
	for (int t = 2; t<=num; t= t+2) {
		System.out.println(t);
	}
	
	
	}

}
