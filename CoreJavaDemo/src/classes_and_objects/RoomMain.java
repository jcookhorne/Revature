package classes_and_objects;

import java.util.Scanner;

public class RoomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 22.50;
		Scanner sc = new Scanner(System.in);
	
		
		
		Room  rm;
		rm = new Room();
		System.out.println("What is the width of your room");
		rm.width = sc.nextInt();
		System.out.println("What is the width of your room");
		rm.height =  sc.nextInt();
		System.out.println("What is the desired color of your room");
		rm.color = sc.nextLine();
		System.out.println("how many walls are in your room");
		rm.howManyWalls = 4;
		sc.close();
		
		System.out.println(rm.calculateArea());
		System.out.println(rm.bathroomWithin());
		System.out.println(rm.calculateWallsPaint(price));
		
	}

}
