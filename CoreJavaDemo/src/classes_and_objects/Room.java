package classes_and_objects;
// implements comparable interface so we can add it to tree set
public class Room implements Comparable{
	// 1) I want to have a room and I should be able to calculate the floor area of
	// the room.
	// I should also be able to calculate the cost of
	// painting the walls of the room.
	// int height;
	int length;
	int width;
	int howManyWalls;
	String color;
	int roomNo;
	static int height; // height no matter what is locked that is static its fixed
	static {
		height = 50;
	}

	public Room(int length, int width) { // length and eidth are free to change
		// this refers to the current object
		this.length = length;// light blue is the instance variable
		this.width = width;// darkblue is the parameter variable that will be passed in
	}

	// creates options which is why you would do it
	// constructor overloading - a type of polymorphism,
	public Room(int length, int width, int roomNo, String color) {
		// constructor chaining this() thats how you chain constructors
		// if another constructor has already called something then you can chain to it
		this(length, width);
		this.color = color;
		this.roomNo = roomNo;	
	}

	public int calculateArea() {
		return length * width;
	}


	Double calculateWallsPaint(double price) {

		return howManyWalls * price;

	}

	int calculatePaintingCost(int paintRate) {
		int wallArea = 2 * ((length * height) + (width * height));
		return wallArea * paintRate;
	}

	String bathroomWithin() {
		return "Yes your room has a bathroom built into it";
	}
	
	
	@Override
	public String toString() {
		return "Room [length=" + length + ", width=" + width + "]";
	}

	//three possible return types
	//positive number
	//zero - both numbers are equal
	// negative number - current object is lesser than the object parameter
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int currentFA = length*width;
		Room incoming = (Room) o;
		int incomingFA = incoming.length * incoming.width;
		
		return currentFA - incomingFA;
	}

}
