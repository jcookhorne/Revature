package arrays;

import classes_and_objects.Room;

public class roomdemo {
	public static void main(String[] args) {
		
	Room room1 = new Room(85,125);
	
	Room[] myRooms = new Room[3];
	myRooms[0] = new Room(95,15);
	myRooms[1] = new Room(45,22);
	myRooms[2] = new Room(15,35);
	
	int [] all = {1, 2, 3, 4};
	// initialize an arrayof room objects
	Room[] allRooms = {new Room(95,15), new Room(45,22), new Room(15,35)};
	
	}
}
