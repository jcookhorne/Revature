package classes_and_objects;

public class Room {
	//1) I want to have a room and I should be able to calculate the floor area of the room. 
	//I should also be able to calculate the cost of 
	//painting the walls of the room.
	//int height;
	int width;
	int howManyWalls;
	String color;
	static int height;
	static {
		 height = 50;
	}
	
	Integer calculateArea() {
		return height * width;
	}
	
	Double calculateWallsPaint(double price) {
		
		return howManyWalls * price;
		
	}
	String bathroomWithin() {
		return "Yes your room has a bathroom built into it";
	}
	
	
}