package classes_and_objects;

import java.util.Scanner;

public class RoomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 22.50;
		Scanner sc = new Scanner(System.in);
	
		
		
		Room  room1 = new Room(85, 120);
		//System.out.println("What is the width of your room");
		//room1.width = sc.nextInt();
	//	System.out.println("What is the length of your room");
	//	room1.length =  sc.nextInt();
		//System.out.println("What is the desired color of your room");
		//room1.color = sc.nextLine();
		//System.out.println("how many walls are in your room");
		//room1.howManyWalls = 4;
		Room room2 = new Room(300,150);
		System.out.println("Painting Cost : " + room2.calculatePaintingCost(2));
		System.out.println("Floor area: " + room2.calculateArea());
		
		
		Room room3 = new Room(400, 200, 101, "Blue");
		
		System.out.println("Painting Cost : " + room3.calculatePaintingCost(2));
		System.out.println("Floor area: " + room3.calculateArea());
		System.out.println("Room color : " + room3.color);
		System.out.println("Floor area: " + room3.roomNo);
		System.out.println(room2);
		
		
		
		
		sc.close();
		
	//	System.out.println(room1.calculateArea());
		//System.out.println(room1.bathroomWithin());
		//System.out.println(room1.calculateWallsPaint(price));
		
	}

}
