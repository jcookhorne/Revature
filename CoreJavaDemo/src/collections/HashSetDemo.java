package collections;

import java.util.HashSet;
import java.util.Set;

import classes_and_objects.Room;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
	
	Set myHashSet = new HashSet();

	String str1 = "Hello";
	String str2 = "Welcome";
	Room room = new Room(5,25);
	//room.getWidth();
	//room.getLength();
	int roomArea =  room.calculateArea();
	
	//Integer number = new Integer(5);// new Integer() is deprecated
	// deprecated means its old and not usual to use
	Integer number = 5;


	myHashSet.add(roomArea);
	myHashSet.add(room);
	myHashSet.add(str1);
	myHashSet.add(str2);
	myHashSet.add(number);
	myHashSet.add(str2);
	// does not maintain order
	// does not accept duplicates
 System.out.println(myHashSet);
	}

}
